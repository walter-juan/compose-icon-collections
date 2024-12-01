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

public val Simpleicons.Startpage: ImageVector
    get() {
        if (_startpage != null) {
            return _startpage!!
        }
        _startpage = Builder(name = "Startpage", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.885f, 14.254f)
                lineToRelative(0.04f, -0.06f)
                arcToRelative(8.723f, 8.723f, 0.0f, false, false, 1.851f, -4.309f)
                curveToRelative(-1.334f, 0.0f, -2.648f, 0.0f, -3.982f, 0.04f)
                arcToRelative(4.901f, 4.901f, 0.0f, false, true, -4.758f, 3.696f)
                arcToRelative(4.948f, 4.948f, 0.0f, false, true, -4.56f, -3.044f)
                arcToRelative(89.632f, 89.632f, 0.0f, false, false, -3.941f, 0.514f)
                curveToRelative(1.035f, 3.697f, 4.46f, 6.405f, 8.501f, 6.405f)
                arcToRelative(8.76f, 8.76f, 0.0f, false, false, 3.743f, -0.83f)
                lineToRelative(0.06f, -0.02f)
                lineToRelative(0.04f, 0.04f)
                lineToRelative(5.455f, 6.603f)
                curveToRelative(0.378f, 0.454f, 0.916f, 0.711f, 1.513f, 0.711f)
                curveToRelative(0.458f, 0.0f, 0.896f, -0.158f, 1.234f, -0.435f)
                curveToRelative(0.399f, -0.336f, 0.657f, -0.79f, 0.697f, -1.304f)
                curveToRelative(0.04f, -0.514f, -0.1f, -1.009f, -0.438f, -1.424f)
                close()
                moveTo(5.118f, 8.56f)
                curveToRelative(0.1f, -2.59f, 2.27f, -4.685f, 4.918f, -4.685f)
                arcToRelative(4.911f, 4.911f, 0.0f, false, true, 4.898f, 4.389f)
                curveToRelative(1.314f, 0.02f, 2.608f, 0.04f, 3.922f, 0.099f)
                curveTo(18.616f, 3.717f, 14.754f, 0.0f, 10.036f, 0.0f)
                curveToRelative(-4.858f, 0.0f, -8.82f, 3.934f, -8.82f, 8.758f)
                verticalLineToRelative(0.178f)
                arcToRelative(86.7f, 86.7f, 0.0f, false, true, 3.902f, -0.376f)
                close()
            }
        }
        .build()
        return _startpage!!
    }

private var _startpage: ImageVector? = null
