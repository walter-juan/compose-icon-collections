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

public val ProtractorGroup.Line: ImageVector
    get() {
        if (_line != null) {
            return _line!!
        }
        _line = Builder(name = "Line", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFFd51c2f)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 0.0f)
                curveToRelative(-35.34f, 0.0f, -64.0f, 28.66f, -64.0f, 64.0f)
                reflectiveCurveToRelative(28.66f, 64.0f, 64.0f, 64.0f)
                curveToRelative(35.34f, 0.0f, 63.99f, -28.66f, 64.0f, -64.0f)
                curveTo(128.0f, 28.66f, 99.34f, 0.0f, 64.0f, 0.0f)
                close()
                moveTo(64.0f, 0.99f)
                curveToRelative(34.81f, 0.0f, 63.01f, 28.2f, 63.01f, 63.01f)
                curveToRelative(-0.0f, 34.81f, -28.2f, 63.01f, -63.01f, 63.01f)
                curveTo(29.19f, 127.01f, 0.99f, 98.81f, 0.99f, 64.0f)
                curveTo(0.99f, 29.19f, 29.19f, 0.99f, 64.0f, 0.99f)
                close()
                moveTo(63.05f, 20.03f)
                lineTo(62.54f, 20.04f)
                arcToRelative(48.42f, 48.42f, 0.0f, false, false, -31.87f, 13.2f)
                lineToRelative(-0.37f, 0.35f)
                lineToRelative(6.77f, 6.77f)
                lineToRelative(-1.34f, 1.34f)
                lineToRelative(-6.77f, -6.77f)
                lineToRelative(-0.35f, 0.37f)
                arcToRelative(48.44f, 48.44f, 0.0f, false, false, -13.2f, 31.87f)
                lineToRelative(-0.01f, 0.51f)
                horizontalLineToRelative(9.06f)
                verticalLineToRelative(1.9f)
                horizontalLineToRelative(-9.09f)
                verticalLineToRelative(11.58f)
                horizontalLineToRelative(97.26f)
                verticalLineToRelative(-11.58f)
                horizontalLineToRelative(-9.08f)
                verticalLineToRelative(-1.9f)
                horizontalLineToRelative(9.06f)
                lineToRelative(-0.01f, -0.51f)
                arcToRelative(48.43f, 48.43f, 0.0f, false, false, -13.2f, -31.87f)
                lineToRelative(-0.35f, -0.37f)
                lineToRelative(-6.77f, 6.77f)
                lineToRelative(-1.34f, -1.34f)
                lineToRelative(6.77f, -6.77f)
                lineToRelative(-0.37f, -0.35f)
                arcToRelative(48.42f, 48.42f, 0.0f, false, false, -31.87f, -13.2f)
                lineToRelative(-0.51f, -0.01f)
                verticalLineToRelative(9.06f)
                horizontalLineToRelative(-1.89f)
                close()
                moveTo(62.06f, 21.1f)
                verticalLineToRelative(8.99f)
                horizontalLineToRelative(3.88f)
                verticalLineToRelative(-8.99f)
                arcToRelative(47.36f, 47.36f, 0.0f, false, true, 30.3f, 12.55f)
                lineToRelative(-6.71f, 6.72f)
                lineToRelative(2.74f, 2.74f)
                lineToRelative(6.72f, -6.72f)
                arcToRelative(47.38f, 47.38f, 0.0f, false, true, 12.55f, 30.3f)
                horizontalLineToRelative(-8.99f)
                verticalLineToRelative(3.88f)
                horizontalLineToRelative(9.08f)
                verticalLineToRelative(9.6f)
                lineTo(16.36f, 80.17f)
                verticalLineToRelative(-9.6f)
                horizontalLineToRelative(9.09f)
                verticalLineToRelative(-3.88f)
                horizontalLineToRelative(-8.99f)
                arcToRelative(47.39f, 47.39f, 0.0f, false, true, 12.55f, -30.3f)
                lineToRelative(6.72f, 6.72f)
                lineToRelative(2.75f, -2.74f)
                lineToRelative(-6.72f, -6.72f)
                arcToRelative(47.37f, 47.37f, 0.0f, false, true, 30.3f, -12.55f)
                close()
                moveTo(61.37f, 36.96f)
                curveTo(44.9f, 38.33f, 32.21f, 52.11f, 32.21f, 68.64f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(63.57f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -18.58f, -15.89f, -33.22f, -34.41f, -31.68f)
                close()
                moveTo(61.45f, 37.95f)
                curveToRelative(17.79f, -1.47f, 33.0f, 12.42f, 33.28f, 30.2f)
                lineTo(33.25f, 68.14f)
                curveToRelative(0.25f, -15.8f, 12.4f, -28.89f, 28.2f, -30.2f)
                close()
            }
        }
        .build()
        return _line!!
    }

private var _line: ImageVector? = null
