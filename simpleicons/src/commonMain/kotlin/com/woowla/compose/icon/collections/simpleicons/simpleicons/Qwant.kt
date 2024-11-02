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

public val Simpleicons.Qwant: ImageVector
    get() {
        if (_qwant != null) {
            return _qwant!!
        }
        _qwant = Builder(name = "Qwant", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.313f, 5.163f)
                curveToRelative(4.289f, 0.0f, 7.766f, 2.589f, 7.766f, 7.616f)
                curveToRelative(0.0f, 4.759f, -3.072f, 7.301f, -7.003f, 7.59f)
                curveToRelative(1.87f, 1.142f, 4.693f, 1.143f, 6.45f, -0.348f)
                lineToRelative(0.547f, 0.297f)
                lineToRelative(-0.615f, 3.074f)
                lineToRelative(-0.226f, 0.285f)
                curveToRelative(-3.118f, 0.918f, -5.947f, -0.099f, -7.921f, -3.329f)
                curveToRelative(-3.816f, -0.37f, -6.765f, -2.9f, -6.765f, -7.568f)
                curveToRelative(0.0f, -5.03f, 3.477f, -7.617f, 7.766f, -7.617f)
                close()
                moveTo(9.313f, 19.043f)
                curveToRelative(2.756f, 0.0f, 4.08f, -2.804f, 4.08f, -6.264f)
                curveToRelative(0.0f, -3.46f, -1.148f, -6.264f, -4.08f, -6.264f)
                curveToRelative(-2.85f, 0.0f, -4.08f, 2.805f, -4.08f, 6.264f)
                curveToRelative(0.0f, 3.46f, 1.182f, 6.264f, 4.08f, 6.264f)
                close()
                moveTo(18.032f, 2.724f)
                lineTo(18.734f, 0.0f)
                horizontalLineToRelative(0.263f)
                lineToRelative(0.703f, 2.725f)
                lineToRelative(2.754f, 0.71f)
                verticalLineToRelative(0.248f)
                lineToRelative(-2.754f, 0.71f)
                lineToRelative(-0.703f, 2.725f)
                horizontalLineToRelative(-0.263f)
                lineToRelative(-0.702f, -2.725f)
                lineToRelative(-2.696f, -0.695f)
                lineTo(15.336f, 3.42f)
                close()
            }
        }
        .build()
        return _qwant!!
    }

private var _qwant: ImageVector? = null
