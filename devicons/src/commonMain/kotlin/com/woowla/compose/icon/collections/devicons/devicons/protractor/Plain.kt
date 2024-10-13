package com.woowla.compose.icon.collections.devicons.devicons.protractor

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.ProtractorGroup

public val ProtractorGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFFd51c2f)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 0.0f)
                curveTo(28.65f, 0.0f, 0.0f, 28.65f, 0.0f, 64.0f)
                reflectiveCurveToRelative(28.65f, 64.0f, 64.0f, 64.0f)
                curveToRelative(35.35f, 0.0f, 63.99f, -28.65f, 64.0f, -64.0f)
                curveTo(127.99f, 28.65f, 99.35f, 0.0f, 64.0f, 0.0f)
                close()
                moveTo(62.54f, 20.2f)
                verticalLineToRelative(9.12f)
                horizontalLineToRelative(2.91f)
                verticalLineToRelative(-9.12f)
                arcTo(48.29f, 48.29f, 0.0f, false, true, 97.24f, 33.36f)
                lineToRelative(-6.81f, 6.82f)
                lineToRelative(2.05f, 2.06f)
                lineToRelative(6.82f, -6.81f)
                arcToRelative(48.3f, 48.3f, 0.0f, false, true, 13.16f, 31.79f)
                horizontalLineToRelative(-9.12f)
                verticalLineToRelative(2.91f)
                horizontalLineToRelative(9.15f)
                verticalLineToRelative(10.67f)
                lineTo(15.48f, 80.8f)
                lineTo(15.48f, 70.13f)
                horizontalLineToRelative(9.16f)
                verticalLineToRelative(-2.91f)
                lineTo(15.53f, 67.21f)
                arcToRelative(48.31f, 48.31f, 0.0f, false, true, 13.16f, -31.79f)
                lineToRelative(6.82f, 6.82f)
                lineToRelative(2.06f, -2.06f)
                lineToRelative(-6.81f, -6.82f)
                arcToRelative(48.3f, 48.3f, 0.0f, false, true, 31.79f, -13.16f)
                close()
                moveTo(61.39f, 37.25f)
                arcToRelative(31.53f, 31.53f, 0.0f, false, false, -28.93f, 31.43f)
                horizontalLineToRelative(63.06f)
                arcToRelative(31.53f, 31.53f, 0.0f, false, false, -34.13f, -31.43f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
