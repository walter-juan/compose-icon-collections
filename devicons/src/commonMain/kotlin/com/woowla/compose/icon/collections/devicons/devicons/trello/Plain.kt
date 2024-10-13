package com.woowla.compose.icon.collections.devicons.devicons.trello

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.TrelloGroup

public val TrelloGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF0052cc)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5f, 0.0f)
                curveTo(5.57f, 0.0f, 0.0f, 5.57f, 0.0f, 12.5f)
                verticalLineToRelative(103.0f)
                curveToRelative(0.0f, 6.93f, 5.57f, 12.5f, 12.5f, 12.5f)
                horizontalLineToRelative(103.0f)
                curveToRelative(6.93f, 0.0f, 12.5f, -5.57f, 12.5f, -12.5f)
                verticalLineToRelative(-103.0f)
                curveTo(128.0f, 5.57f, 122.43f, 0.0f, 115.5f, 0.0f)
                close()
                moveTo(22.64f, 16.64f)
                horizontalLineToRelative(27.04f)
                curveToRelative(3.32f, 0.0f, 6.0f, 2.68f, 6.0f, 6.0f)
                verticalLineToRelative(76.0f)
                curveToRelative(0.0f, 3.33f, -2.68f, 6.0f, -6.0f, 6.0f)
                lineTo(22.64f, 104.64f)
                curveToRelative(-3.32f, 0.0f, -6.0f, -2.67f, -6.0f, -6.0f)
                verticalLineToRelative(-76.0f)
                curveToRelative(0.0f, -3.32f, 2.68f, -6.0f, 6.0f, -6.0f)
                close()
                moveTo(78.32f, 16.64f)
                horizontalLineToRelative(27.04f)
                curveToRelative(3.32f, 0.0f, 6.0f, 2.68f, 6.0f, 6.0f)
                verticalLineToRelative(44.0f)
                curveToRelative(0.0f, 3.33f, -2.68f, 6.0f, -6.0f, 6.0f)
                lineTo(78.32f, 72.64f)
                curveToRelative(-3.32f, 0.0f, -6.0f, -2.67f, -6.0f, -6.0f)
                verticalLineToRelative(-44.0f)
                curveToRelative(0.0f, -3.32f, 2.68f, -6.0f, 6.0f, -6.0f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
