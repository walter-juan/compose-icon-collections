package com.woowla.compose.icon.collections.devicons.devicons.pnpm

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.PnpmGroup

public val PnpmGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                lineTo(0.0f, 40.0f)
                horizontalLineToRelative(40.0f)
                lineTo(40.0f, 0.0f)
                close()
                moveTo(44.0f, 0.0f)
                lineTo(44.0f, 40.0f)
                horizontalLineToRelative(40.0f)
                lineTo(84.0f, 0.0f)
                close()
                moveTo(88.0f, 0.0f)
                lineTo(88.0f, 40.0f)
                lineTo(128.0f, 40.0f)
                lineTo(128.0f, 0.0f)
                close()
                moveTo(44.0f, 44.0f)
                verticalLineToRelative(40.0f)
                horizontalLineToRelative(40.0f)
                lineTo(84.0f, 44.0f)
                close()
                moveTo(88.0f, 44.0f)
                verticalLineToRelative(40.0f)
                lineTo(128.0f, 84.0f)
                lineTo(128.0f, 44.0f)
                close()
                moveTo(0.0f, 88.0f)
                verticalLineToRelative(40.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(-40.0f)
                close()
                moveTo(44.0f, 88.0f)
                verticalLineToRelative(40.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(-40.0f)
                close()
                moveTo(88.0f, 88.0f)
                verticalLineToRelative(40.0f)
                lineTo(128.0f, 128.0f)
                verticalLineToRelative(-40.0f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
