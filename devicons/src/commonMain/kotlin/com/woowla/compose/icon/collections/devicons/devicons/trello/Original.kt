package com.woowla.compose.icon.collections.devicons.devicons.trello

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.TrelloGroup

public val TrelloGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = linearGradient(0.0f to Color(0xFF2684FF), 1.0f to Color(0xFF0052CC), start =
                    Offset(64.0f,0.0f), end = Offset(64.0f,128.0f)), stroke = null, strokeLineWidth
                    = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5f, 0.0f)
                horizontalLineToRelative(103.0f)
                curveToRelative(6.93f, 0.0f, 12.5f, 5.57f, 12.5f, 12.5f)
                verticalLineToRelative(103.0f)
                curveToRelative(0.0f, 6.93f, -5.57f, 12.5f, -12.5f, 12.5f)
                horizontalLineToRelative(-103.0f)
                curveTo(5.57f, 128.0f, 0.0f, 122.43f, 0.0f, 115.5f)
                verticalLineToRelative(-103.0f)
                curveTo(0.0f, 5.57f, 5.57f, 0.0f, 12.5f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(78.32f, 16.64f)
                horizontalLineToRelative(27.04f)
                curveToRelative(3.32f, 0.0f, 6.0f, 2.68f, 6.0f, 6.0f)
                verticalLineToRelative(44.0f)
                curveToRelative(0.0f, 3.32f, -2.68f, 6.0f, -6.0f, 6.0f)
                lineTo(78.32f, 72.64f)
                curveToRelative(-3.32f, 0.0f, -6.0f, -2.68f, -6.0f, -6.0f)
                verticalLineToRelative(-44.0f)
                curveToRelative(0.0f, -3.32f, 2.68f, -6.0f, 6.0f, -6.0f)
                close()
                moveTo(22.64f, 16.64f)
                horizontalLineToRelative(27.04f)
                curveToRelative(3.32f, 0.0f, 6.0f, 2.68f, 6.0f, 6.0f)
                verticalLineToRelative(76.0f)
                curveToRelative(0.0f, 3.32f, -2.68f, 6.0f, -6.0f, 6.0f)
                lineTo(22.64f, 104.64f)
                curveToRelative(-3.32f, 0.0f, -6.0f, -2.68f, -6.0f, -6.0f)
                verticalLineToRelative(-76.0f)
                curveToRelative(0.0f, -3.32f, 2.68f, -6.0f, 6.0f, -6.0f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
