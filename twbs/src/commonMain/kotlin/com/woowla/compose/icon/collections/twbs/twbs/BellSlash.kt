package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.BellSlash: ImageVector
    get() {
        if (_bellSlash != null) {
            return _bellSlash!!
        }
        _bellSlash = Builder(name = "BellSlash", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.164f, 14.0f)
                lineTo(15.0f, 14.0f)
                curveToRelative(-0.299f, -0.199f, -0.557f, -0.553f, -0.78f, -1.0f)
                curveToRelative(-0.9f, -1.8f, -1.22f, -5.12f, -1.22f, -6.0f)
                quadToRelative(0.0f, -0.396f, -0.06f, -0.776f)
                lineToRelative(-0.938f, 0.938f)
                curveToRelative(0.02f, 0.708f, 0.157f, 2.154f, 0.457f, 3.58f)
                curveToRelative(0.161f, 0.767f, 0.377f, 1.566f, 0.663f, 2.258f)
                lineTo(6.164f, 13.0f)
                close()
                moveTo(10.745f, 4.09f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.948f, -1.01f)
                lineTo(8.0f, 2.917f)
                lineToRelative(-0.797f, 0.161f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 4.0f, 7.0f)
                curveToRelative(0.0f, 0.628f, -0.134f, 2.197f, -0.459f, 3.742f)
                quadToRelative(-0.075f, 0.358f, -0.166f, 0.718f)
                lineToRelative(-1.653f, 1.653f)
                quadToRelative(0.03f, -0.055f, 0.059f, -0.113f)
                curveTo(2.679f, 11.2f, 3.0f, 7.88f, 3.0f, 7.0f)
                curveToRelative(0.0f, -2.42f, 1.72f, -4.44f, 4.005f, -4.901f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.99f, 0.0f)
                curveToRelative(0.942f, 0.19f, 1.788f, 0.645f, 2.457f, 1.284f)
                close()
                moveTo(10.0f, 15.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
                close()
                moveTo(0.625f, 15.625f)
                arcToRelative(0.53f, 0.53f, 0.0f, false, false, 0.75f, 0.75f)
                lineToRelative(14.75f, -14.75f)
                arcToRelative(0.53f, 0.53f, 0.0f, false, false, -0.75f, -0.75f)
                close()
            }
        }
        .build()
        return _bellSlash!!
    }

private var _bellSlash: ImageVector? = null
