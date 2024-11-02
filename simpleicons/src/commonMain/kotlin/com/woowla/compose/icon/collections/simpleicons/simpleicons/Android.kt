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

public val Simpleicons.Android: ImageVector
    get() {
        if (_android != null) {
            return _android!!
        }
        _android = Builder(name = "Android", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.44f, 5.559f)
                curveToRelative(-0.675f, 1.166f, -1.352f, 2.332f, -2.027f, 3.498f)
                curveToRelative(-0.037f, -0.015f, -0.074f, -0.029f, -0.111f, -0.043f)
                curveToRelative(-1.825f, -0.696f, -3.484f, -0.8f, -4.42f, -0.787f)
                curveToRelative(-1.855f, 0.019f, -3.354f, 0.464f, -4.26f, 0.82f)
                curveToRelative(-0.084f, -0.149f, -1.753f, -3.021f, -2.022f, -3.486f)
                arcToRelative(1.145f, 1.145f, 0.0f, false, false, -0.141f, -0.191f)
                curveToRelative(-0.331f, -0.364f, -0.905f, -0.486f, -1.379f, -0.203f)
                curveToRelative(-0.475f, 0.282f, -0.714f, 0.936f, -0.389f, 1.502f)
                curveToRelative(1.947f, 3.37f, -0.097f, -0.216f, 1.947f, 3.359f)
                curveToRelative(0.017f, 0.031f, -0.495f, 0.264f, -1.393f, 1.018f)
                curveTo(2.899f, 12.176f, 0.452f, 14.772f, 0.0f, 18.99f)
                horizontalLineToRelative(24.0f)
                curveToRelative(-0.119f, -1.111f, -0.369f, -2.099f, -0.746f, -3.068f)
                curveToRelative(-0.744f, -1.912f, -1.844f, -3.293f, -2.74f, -4.184f)
                arcToRelative(12.105f, 12.105f, 0.0f, false, false, -2.131f, -1.688f)
                curveToRelative(0.659f, -1.122f, 1.312f, -2.256f, 1.965f, -3.385f)
                curveToRelative(0.208f, -0.361f, 0.189f, -0.796f, -0.008f, -1.119f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, false, -0.851f, -0.533f)
                curveToRelative(-0.522f, -0.054f, -0.939f, 0.313f, -1.049f, 0.545f)
                close()
                moveTo(18.4f, 14.02f)
                curveToRelative(0.394f, 0.593f, 0.324f, 1.331f, -0.156f, 1.65f)
                curveToRelative(-0.48f, 0.32f, -1.188f, 0.098f, -1.582f, -0.494f)
                curveToRelative(-0.394f, -0.593f, -0.324f, -1.331f, 0.156f, -1.65f)
                curveToRelative(0.473f, -0.315f, 1.181f, -0.109f, 1.582f, 0.494f)
                close()
                moveTo(7.207f, 13.527f)
                curveToRelative(0.48f, 0.32f, 0.551f, 1.058f, 0.156f, 1.65f)
                curveToRelative(-0.394f, 0.593f, -1.104f, 0.814f, -1.584f, 0.494f)
                curveToRelative(-0.48f, -0.32f, -0.55f, -1.058f, -0.156f, -1.65f)
                curveToRelative(0.401f, -0.602f, 1.109f, -0.811f, 1.584f, -0.494f)
                close()
            }
        }
        .build()
        return _android!!
    }

private var _android: ImageVector? = null
