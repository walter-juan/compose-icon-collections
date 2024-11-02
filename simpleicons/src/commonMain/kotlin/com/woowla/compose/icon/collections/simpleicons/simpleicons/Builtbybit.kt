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

public val Simpleicons.Builtbybit: ImageVector
    get() {
        if (_builtbybit != null) {
            return _builtbybit!!
        }
        _builtbybit = Builder(name = "Builtbybit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.877f, 0.032f)
                lineTo(1.252f, 5.885f)
                arcToRelative(0.253f, 0.253f, 0.0f, false, false, 0.003f, 0.446f)
                lineToRelative(5.679f, 3.02f)
                curveToRelative(0.077f, 0.041f, 0.17f, 0.04f, 0.246f, -0.004f)
                lineToRelative(4.694f, -2.697f)
                arcToRelative(0.254f, 0.254f, 0.0f, false, true, 0.253f, 0.0f)
                lineToRelative(4.692f, 2.697f)
                arcToRelative(0.253f, 0.253f, 0.0f, false, false, 0.246f, 0.004f)
                lineToRelative(5.682f, -3.021f)
                arcToRelative(0.253f, 0.253f, 0.0f, false, false, 0.003f, -0.446f)
                lineTo(12.122f, 0.031f)
                arcToRelative(0.254f, 0.254f, 0.0f, false, false, -0.245f, 0.0f)
                close()
                moveTo(6.924f, 10.898f)
                lineToRelative(-5.71f, -3.036f)
                arcToRelative(0.254f, 0.254f, 0.0f, false, false, -0.373f, 0.224f)
                lineTo(0.841f, 18.25f)
                curveToRelative(0.0f, 0.093f, 0.05f, 0.178f, 0.131f, 0.222f)
                lineToRelative(9.976f, 5.495f)
                arcToRelative(0.254f, 0.254f, 0.0f, false, false, 0.376f, -0.222f)
                verticalLineToRelative(-6.053f)
                arcToRelative(0.255f, 0.255f, 0.0f, false, false, -0.127f, -0.22f)
                lineToRelative(-4.012f, -2.305f)
                arcToRelative(0.252f, 0.252f, 0.0f, false, true, -0.127f, -0.22f)
                verticalLineToRelative(-3.825f)
                arcToRelative(0.253f, 0.253f, 0.0f, false, false, -0.135f, -0.224f)
                close()
                moveTo(17.076f, 10.898f)
                lineTo(22.786f, 7.863f)
                arcToRelative(0.254f, 0.254f, 0.0f, false, true, 0.373f, 0.224f)
                verticalLineToRelative(10.164f)
                curveToRelative(0.0f, 0.093f, -0.05f, 0.178f, -0.131f, 0.222f)
                lineToRelative(-9.976f, 5.495f)
                arcToRelative(0.254f, 0.254f, 0.0f, false, true, -0.376f, -0.222f)
                verticalLineToRelative(-6.053f)
                curveToRelative(0.0f, -0.091f, 0.049f, -0.175f, 0.127f, -0.22f)
                lineToRelative(4.012f, -2.305f)
                arcToRelative(0.252f, 0.252f, 0.0f, false, false, 0.127f, -0.22f)
                verticalLineToRelative(-3.825f)
                curveToRelative(0.0f, -0.094f, 0.052f, -0.18f, 0.135f, -0.224f)
                close()
            }
        }
        .build()
        return _builtbybit!!
    }

private var _builtbybit: ImageVector? = null
