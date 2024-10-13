package com.woowla.compose.icon.collections.devicons.devicons.openstack

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.OpenstackGroup

public val OpenstackGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFFed1944)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(123.89f, 111.93f)
                verticalLineToRelative(-0.03f)
                arcToRelative(1.74f, 1.74f, 0.0f, false, false, -0.46f, -1.26f)
                arcToRelative(2.04f, 2.04f, 0.0f, false, false, -1.48f, -0.52f)
                horizontalLineToRelative(-2.04f)
                verticalLineToRelative(5.44f)
                horizontalLineToRelative(1.12f)
                verticalLineToRelative(-1.81f)
                horizontalLineToRelative(0.69f)
                lineToRelative(1.0f, 1.81f)
                horizontalLineToRelative(1.29f)
                lineToRelative(-1.16f, -2.03f)
                arcToRelative(1.64f, 1.64f, 0.0f, false, false, 1.03f, -1.6f)
                close()
                moveTo(122.75f, 111.97f)
                arcToRelative(0.79f, 0.79f, 0.0f, false, true, -0.89f, 0.82f)
                horizontalLineToRelative(-0.83f)
                verticalLineToRelative(-1.64f)
                horizontalLineToRelative(0.81f)
                curveToRelative(0.6f, 0.0f, 0.91f, 0.27f, 0.91f, 0.82f)
                close()
                moveTo(127.36f, 112.94f)
                arcToRelative(5.56f, 5.56f, 0.0f, true, false, -5.56f, 5.57f)
                arcToRelative(5.57f, 5.57f, 0.0f, false, false, 5.56f, -5.57f)
                close()
                moveTo(121.8f, 117.13f)
                arcToRelative(4.2f, 4.2f, 0.0f, true, true, 4.19f, -4.19f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, -4.2f, 4.19f)
                close()
                moveTo(86.87f, 51.42f)
                horizontalLineToRelative(25.16f)
                verticalLineToRelative(25.16f)
                lineTo(86.86f, 76.58f)
                close()
                moveTo(0.64f, 51.42f)
                horizontalLineToRelative(25.16f)
                verticalLineToRelative(25.16f)
                lineTo(0.64f, 76.58f)
                close()
                moveTo(86.87f, 87.75f)
                arcToRelative(5.6f, 5.6f, 0.0f, false, true, -5.6f, 5.6f)
                lineTo(31.39f, 93.35f)
                arcToRelative(5.6f, 5.6f, 0.0f, false, true, -5.6f, -5.6f)
                lineTo(25.79f, 83.77f)
                lineTo(0.64f, 83.77f)
                verticalLineToRelative(24.38f)
                arcToRelative(10.38f, 10.38f, 0.0f, false, false, 10.35f, 10.35f)
                horizontalLineToRelative(90.66f)
                arcToRelative(10.38f, 10.38f, 0.0f, false, false, 10.4f, -10.35f)
                lineTo(112.05f, 83.77f)
                lineTo(86.86f, 83.77f)
                close()
                moveTo(101.67f, 9.5f)
                lineTo(11.01f, 9.5f)
                arcTo(10.38f, 10.38f, 0.0f, false, false, 0.66f, 19.84f)
                lineTo(0.66f, 44.23f)
                horizontalLineToRelative(25.15f)
                verticalLineToRelative(-3.98f)
                arcToRelative(5.6f, 5.6f, 0.0f, false, true, 5.6f, -5.6f)
                horizontalLineToRelative(49.88f)
                arcToRelative(5.6f, 5.6f, 0.0f, false, true, 5.6f, 5.6f)
                verticalLineToRelative(3.98f)
                horizontalLineToRelative(25.17f)
                lineTo(112.05f, 19.84f)
                arcToRelative(10.38f, 10.38f, 0.0f, false, false, -10.38f, -10.35f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
