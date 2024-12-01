package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Backbone: ImageVector
    get() {
        if (_backbone != null) {
            return _backbone!!
        }
        _backbone = Builder(name = "Backbone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.978f, 0.805f)
                arcTo(5.3f, 5.3f, 0.0f, false, true, 9.972f, 2.29f)
                arcToRelative(5.3f, 5.3f, 0.0f, false, true, 2.006f, 1.487f)
                arcToRelative(5.3f, 5.3f, 0.0f, false, true, 2.006f, -1.488f)
                arcTo(5.3f, 5.3f, 0.0f, false, true, 11.978f, 0.804f)
                moveToRelative(10.6f, 17.27f)
                lineTo(19.45f, 19.22f)
                verticalLineToRelative(-6.875f)
                curveToRelative(0.0f, -0.456f, 0.37f, -0.826f, 0.825f, -0.826f)
                horizontalLineToRelative(1.479f)
                curveToRelative(0.454f, 0.0f, 0.824f, 0.37f, 0.824f, 0.826f)
                close()
                moveTo(18.028f, 12.344f)
                verticalLineToRelative(7.399f)
                lineToRelative(-3.865f, 1.416f)
                verticalLineToRelative(-14.0f)
                curveToRelative(0.0f, -0.22f, 0.087f, -0.43f, 0.243f, -0.585f)
                arcToRelative(0.82f, 0.82f, 0.0f, false, true, 0.58f, -0.24f)
                horizontalLineToRelative(0.008f)
                lineToRelative(2.213f, 0.019f)
                arcToRelative(0.827f, 0.827f, 0.0f, false, true, 0.818f, 0.824f)
                verticalLineToRelative(5.086f)
                horizontalLineToRelative(0.004f)
                close()
                moveTo(21.755f, 10.098f)
                horizontalLineToRelative(-1.48f)
                curveToRelative(-0.291f, 0.0f, -0.57f, 0.055f, -0.826f, 0.157f)
                lineTo(19.449f, 7.178f)
                curveToRelative(0.0f, -1.23f, -1.0f, -2.237f, -2.23f, -2.247f)
                lineToRelative(-2.213f, -0.017f)
                horizontalLineToRelative(-0.019f)
                arcToRelative(2.23f, 2.23f, 0.0f, false, false, -1.582f, 0.651f)
                arcToRelative(2.23f, 2.23f, 0.0f, false, false, -0.664f, 1.595f)
                verticalLineToRelative(16.037f)
                lineTo(24.0f, 19.068f)
                verticalLineToRelative(-6.725f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, -2.247f, -2.246f)
                moveTo(9.839f, 21.159f)
                lineToRelative(-3.865f, -1.416f)
                verticalLineToRelative(-7.398f)
                lineToRelative(-0.001f, -0.08f)
                horizontalLineToRelative(0.003f)
                lineTo(5.976f, 7.176f)
                curveToRelative(0.0f, -0.45f, 0.367f, -0.82f, 0.818f, -0.824f)
                lineToRelative(2.214f, -0.018f)
                horizontalLineToRelative(0.007f)
                arcToRelative(0.82f, 0.82f, 0.0f, false, true, 0.58f, 0.24f)
                arcToRelative(0.82f, 0.82f, 0.0f, false, true, 0.244f, 0.585f)
                close()
                moveTo(4.551f, 19.22f)
                lineToRelative(-3.127f, -1.146f)
                verticalLineToRelative(-5.73f)
                curveToRelative(0.0f, -0.456f, 0.37f, -0.826f, 0.824f, -0.826f)
                horizontalLineToRelative(1.479f)
                curveToRelative(0.454f, 0.0f, 0.824f, 0.37f, 0.824f, 0.826f)
                close()
                moveTo(9.015f, 4.913f)
                horizontalLineToRelative(-0.018f)
                lineToRelative(-2.214f, 0.018f)
                arcToRelative(2.254f, 2.254f, 0.0f, false, false, -2.23f, 2.247f)
                verticalLineToRelative(3.076f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, false, -0.826f, -0.157f)
                horizontalLineToRelative(-1.48f)
                arcTo(2.25f, 2.25f, 0.0f, false, false, 0.0f, 12.345f)
                verticalLineToRelative(6.724f)
                lineToRelative(11.262f, 4.127f)
                lineTo(11.262f, 7.157f)
                arcToRelative(2.23f, 2.23f, 0.0f, false, false, -0.665f, -1.594f)
                arcToRelative(2.23f, 2.23f, 0.0f, false, false, -1.582f, -0.652f)
            }
        }
        .build()
        return _backbone!!
    }

private var _backbone: ImageVector? = null
