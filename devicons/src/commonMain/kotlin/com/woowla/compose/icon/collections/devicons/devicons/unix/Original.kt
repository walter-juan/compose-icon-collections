package com.woowla.compose.icon.collections.devicons.devicons.unix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.UnixGroup

public val UnixGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF4051b5)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 3.0f)
                verticalLineToRelative(6.55f)
                horizontalLineToRelative(40.79f)
                lineTo(47.79f, 3.0f)
                lineTo(7.0f, 3.0f)
                close()
                moveTo(78.75f, 3.0f)
                verticalLineToRelative(6.55f)
                lineTo(121.0f, 9.55f)
                lineTo(121.0f, 3.0f)
                lineTo(78.75f, 3.0f)
                close()
                moveTo(7.0f, 16.83f)
                verticalLineToRelative(6.55f)
                horizontalLineToRelative(40.79f)
                verticalLineToRelative(-6.55f)
                lineTo(7.0f, 16.83f)
                close()
                moveTo(78.75f, 16.83f)
                verticalLineToRelative(6.55f)
                lineTo(121.0f, 23.39f)
                verticalLineToRelative(-6.55f)
                lineTo(78.75f, 16.83f)
                close()
                moveTo(7.0f, 30.31f)
                verticalLineToRelative(6.55f)
                horizontalLineToRelative(40.79f)
                verticalLineToRelative(-6.55f)
                lineTo(7.0f, 30.31f)
                close()
                moveTo(78.75f, 30.31f)
                verticalLineToRelative(6.55f)
                lineTo(121.0f, 36.86f)
                verticalLineToRelative(-6.55f)
                lineTo(78.75f, 30.31f)
                close()
                moveTo(7.0f, 60.6f)
                curveToRelative(0.0f, 22.57f, 0.07f, 23.52f, 2.55f, 30.91f)
                curveToRelative(2.66f, 8.05f, 6.23f, 13.87f, 11.8f, 19.44f)
                curveToRelative(9.76f, 9.69f, 22.4f, 14.45f, 39.74f, 15.0f)
                curveToRelative(19.89f, 0.62f, 35.0f, -4.37f, 45.71f, -15.15f)
                curveToRelative(5.5f, -5.53f, 9.61f, -12.49f, 11.98f, -20.24f)
                curveToRelative(2.15f, -6.99f, 2.22f, -8.15f, 2.22f, -30.07f)
                lineTo(121.0f, 40.5f)
                lineToRelative(-21.01f, 0.07f)
                lineToRelative(-21.05f, 0.11f)
                reflectiveCurveToRelative(-0.18f, 0.07f, -0.18f, 28.94f)
                curveToRelative(0.0f, 32.98f, -5.53f, 38.91f, -16.19f, 38.91f)
                reflectiveCurveToRelative(-14.9f, -5.67f, -14.69f, -39.75f)
                curveToRelative(0.17f, -28.19f, -0.11f, -28.29f, -0.11f, -28.29f)
                lineTo(7.0f, 40.5f)
                verticalLineToRelative(20.1f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
