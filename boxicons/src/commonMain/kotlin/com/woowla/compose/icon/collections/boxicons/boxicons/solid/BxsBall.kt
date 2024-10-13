package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsBall: ImageVector
    get() {
        if (_bxsBall != null) {
            return _bxsBall!!
        }
        _bxsBall = Builder(name = "BxsBall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.247f, 3.034f)
                curveToRelative(-0.069f, -0.018f, -1.742f, -0.433f, -4.052f, -0.433f)
                curveToRelative(-2.842f, 0.0f, -6.868f, 0.64f, -9.91f, 3.687f)
                curveToRelative(-5.34f, 5.349f, -3.34f, 13.61f, -3.252f, 13.96f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.728f, 0.726f)
                curveToRelative(0.069f, 0.018f, 1.726f, 0.426f, 4.018f, 0.426f)
                curveToRelative(2.849f, 0.0f, 6.884f, -0.641f, 9.932f, -3.688f)
                curveToRelative(5.335f, -5.335f, 3.351f, -13.6f, 3.264f, -13.949f)
                arcToRelative(1.005f, 1.005f, 0.0f, false, false, -0.728f, -0.729f)
                close()
                moveTo(16.71f, 12.296f)
                lineTo(15.296f, 13.71f)
                lineTo(13.503f, 11.918f)
                lineTo(11.917f, 13.504f)
                lineTo(13.709f, 15.297f)
                lineTo(12.295f, 16.711f)
                lineTo(10.503f, 14.918f)
                lineTo(8.71f, 16.711f)
                lineTo(7.296f, 15.297f)
                lineTo(9.089f, 13.504f)
                lineTo(7.296f, 11.71f)
                lineTo(8.71f, 10.296f)
                lineTo(10.503f, 12.09f)
                lineTo(12.089f, 10.504f)
                lineTo(10.295f, 8.711f)
                lineTo(11.709f, 7.297f)
                lineTo(13.503f, 9.09f)
                lineTo(15.296f, 7.297f)
                lineTo(16.71f, 8.711f)
                lineTo(14.917f, 10.504f)
                lineTo(16.71f, 12.296f)
                close()
            }
        }
        .build()
        return _bxsBall!!
    }

private var _bxsBall: ImageVector? = null
