package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsPhoneCall: ImageVector
    get() {
        if (_bxsPhoneCall != null) {
            return _bxsPhoneCall!!
        }
        _bxsPhoneCall = Builder(name = "BxsPhoneCall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 10.999f)
                horizontalLineToRelative(2.0f)
                curveTo(22.0f, 5.869f, 18.127f, 2.0f, 12.99f, 2.0f)
                verticalLineToRelative(2.0f)
                curveTo(17.052f, 4.0f, 20.0f, 6.943f, 20.0f, 10.999f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 8.0f)
                curveToRelative(2.103f, 0.0f, 3.0f, 0.897f, 3.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -3.225f, -1.775f, -5.0f, -5.0f, -5.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(16.422f, 13.443f)
                arcToRelative(1.001f, 1.001f, 0.0f, false, false, -1.391f, 0.043f)
                lineToRelative(-2.393f, 2.461f)
                curveToRelative(-0.576f, -0.11f, -1.734f, -0.471f, -2.926f, -1.66f)
                curveToRelative(-1.192f, -1.193f, -1.553f, -2.354f, -1.66f, -2.926f)
                lineToRelative(2.459f, -2.394f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.043f, -1.391f)
                lineTo(6.859f, 3.513f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.391f, -0.087f)
                lineToRelative(-2.17f, 1.861f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.29f, 0.649f)
                curveToRelative(-0.015f, 0.25f, -0.301f, 6.172f, 4.291f, 10.766f)
                curveTo(11.305f, 20.707f, 16.323f, 21.0f, 17.705f, 21.0f)
                curveToRelative(0.202f, 0.0f, 0.326f, -0.006f, 0.359f, -0.008f)
                arcToRelative(0.992f, 0.992f, 0.0f, false, false, 0.648f, -0.291f)
                lineToRelative(1.86f, -2.171f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.086f, -1.391f)
                lineToRelative(-4.064f, -3.696f)
                close()
            }
        }
        .build()
        return _bxsPhoneCall!!
    }

private var _bxsPhoneCall: ImageVector? = null
