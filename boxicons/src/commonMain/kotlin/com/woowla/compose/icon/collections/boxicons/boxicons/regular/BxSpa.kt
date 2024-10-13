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

public val RegularGroup.BxSpa: ImageVector
    get() {
        if (_bxSpa != null) {
            return _bxSpa!!
        }
        _bxSpa = Builder(name = "BxSpa", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.787f, 9.023f)
                curveToRelative(-0.125f, 0.027f, -1.803f, 0.418f, -3.953f, 1.774f)
                curveToRelative(-0.323f, -1.567f, -1.279f, -4.501f, -4.108f, -7.485f)
                lineTo(12.0f, 2.546f)
                lineToRelative(-0.726f, 0.767f)
                curveTo(8.435f, 6.308f, 7.483f, 9.25f, 7.163f, 10.827f)
                curveTo(5.005f, 9.448f, 3.34f, 9.052f, 3.218f, 9.024f)
                lineTo(2.0f, 8.752f)
                verticalLineTo(10.0f)
                curveToRelative(0.0f, 7.29f, 3.925f, 12.0f, 10.0f, 12.0f)
                curveToRelative(5.981f, 0.0f, 10.0f, -4.822f, 10.0f, -12.0f)
                verticalLineTo(8.758f)
                lineToRelative(-1.213f, 0.265f)
                close()
                moveTo(8.999f, 12.038f)
                curveToRelative(0.002f, -0.033f, 0.152f, -3.1f, 3.001f, -6.532f)
                curveTo(14.814f, 8.906f, 14.999f, 12.0f, 15.0f, 12.0f)
                verticalLineToRelative(0.125f)
                arcToRelative(18.933f, 18.933f, 0.0f, false, false, -3.01f, 3.154f)
                arcToRelative(19.877f, 19.877f, 0.0f, false, false, -2.991f, -3.113f)
                verticalLineToRelative(-0.128f)
                close()
                moveTo(12.0f, 20.0f)
                curveToRelative(-5.316f, 0.0f, -7.549f, -4.196f, -7.937f, -8.564f)
                curveToRelative(1.655f, 0.718f, 4.616f, 2.426f, 7.107f, 6.123f)
                lineToRelative(0.841f, 1.249f)
                lineToRelative(0.825f, -1.26f)
                curveToRelative(2.426f, -3.708f, 5.425f, -5.411f, 7.096f, -6.122f)
                curveTo(19.534f, 15.654f, 17.304f, 20.0f, 12.0f, 20.0f)
                close()
            }
        }
        .build()
        return _bxSpa!!
    }

private var _bxSpa: ImageVector? = null
