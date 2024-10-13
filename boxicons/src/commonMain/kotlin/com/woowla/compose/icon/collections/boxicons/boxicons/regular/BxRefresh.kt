package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxRefresh: ImageVector
    get() {
        if (_bxRefresh != null) {
            return _bxRefresh!!
        }
        _bxRefresh = Builder(name = "BxRefresh", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 11.0f)
                lineTo(7.101f, 11.0f)
                lineToRelative(0.001f, -0.009f)
                arcToRelative(4.956f, 4.956f, 0.0f, false, true, 0.752f, -1.787f)
                arcToRelative(5.054f, 5.054f, 0.0f, false, true, 2.2f, -1.811f)
                curveToRelative(0.302f, -0.128f, 0.617f, -0.226f, 0.938f, -0.291f)
                arcToRelative(5.078f, 5.078f, 0.0f, false, true, 2.018f, 0.0f)
                arcToRelative(4.978f, 4.978f, 0.0f, false, true, 2.525f, 1.361f)
                lineToRelative(1.416f, -1.412f)
                arcToRelative(7.036f, 7.036f, 0.0f, false, false, -2.224f, -1.501f)
                arcToRelative(6.921f, 6.921f, 0.0f, false, false, -1.315f, -0.408f)
                arcToRelative(7.079f, 7.079f, 0.0f, false, false, -2.819f, 0.0f)
                arcToRelative(6.94f, 6.94f, 0.0f, false, false, -1.316f, 0.409f)
                arcToRelative(7.04f, 7.04f, 0.0f, false, false, -3.08f, 2.534f)
                arcToRelative(6.978f, 6.978f, 0.0f, false, false, -1.054f, 2.505f)
                curveToRelative(-0.028f, 0.135f, -0.043f, 0.273f, -0.063f, 0.41f)
                lineTo(2.0f, 11.0f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(4.0f, -4.0f)
                close()
                moveTo(14.0f, 13.0f)
                horizontalLineToRelative(2.899f)
                lineToRelative(-0.001f, 0.008f)
                arcToRelative(4.976f, 4.976f, 0.0f, false, true, -2.103f, 3.138f)
                arcToRelative(4.943f, 4.943f, 0.0f, false, true, -1.787f, 0.752f)
                arcToRelative(5.073f, 5.073f, 0.0f, false, true, -2.017f, 0.0f)
                arcToRelative(4.956f, 4.956f, 0.0f, false, true, -1.787f, -0.752f)
                arcToRelative(5.072f, 5.072f, 0.0f, false, true, -0.74f, -0.61f)
                lineTo(7.05f, 16.95f)
                arcToRelative(7.032f, 7.032f, 0.0f, false, false, 2.225f, 1.5f)
                curveToRelative(0.424f, 0.18f, 0.867f, 0.317f, 1.315f, 0.408f)
                arcToRelative(7.07f, 7.07f, 0.0f, false, false, 2.818f, 0.0f)
                arcToRelative(7.031f, 7.031f, 0.0f, false, false, 4.395f, -2.945f)
                arcToRelative(6.974f, 6.974f, 0.0f, false, false, 1.053f, -2.503f)
                curveToRelative(0.027f, -0.135f, 0.043f, -0.273f, 0.063f, -0.41f)
                lineTo(22.0f, 13.0f)
                lineToRelative(-4.0f, -4.0f)
                lineToRelative(-4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _bxRefresh!!
    }

private var _bxRefresh: ImageVector? = null
