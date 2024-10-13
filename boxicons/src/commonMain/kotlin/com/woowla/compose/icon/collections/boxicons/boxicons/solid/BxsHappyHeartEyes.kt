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

public val SolidGroup.BxsHappyHeartEyes: ImageVector
    get() {
        if (_bxsHappyHeartEyes != null) {
            return _bxsHappyHeartEyes!!
        }
        _bxsHappyHeartEyes = Builder(name = "BxsHappyHeartEyes", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.486f, 2.0f, 2.0f, 6.486f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.486f, 10.0f, -10.0f)
                reflectiveCurveTo(17.514f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(6.435f, 8.467f)
                arcTo(1.49f, 1.49f, 0.0f, false, true, 8.502f, 8.4f)
                arcToRelative(1.49f, 1.49f, 0.0f, false, true, 2.065f, 0.033f)
                curveToRelative(0.597f, 0.592f, 0.604f, 1.521f, 0.018f, 2.118f)
                lineToRelative(-2.05f, 2.083f)
                lineToRelative(-2.082f, -2.05f)
                arcToRelative(1.484f, 1.484f, 0.0f, false, true, -0.018f, -2.117f)
                close()
                moveTo(12.0f, 18.0f)
                curveToRelative(-4.0f, 0.0f, -5.0f, -4.0f, -5.0f, -4.0f)
                horizontalLineToRelative(10.0f)
                reflectiveCurveToRelative(-1.0f, 4.0f, -5.0f, 4.0f)
                close()
                moveTo(17.585f, 10.551f)
                lineTo(15.535f, 12.634f)
                lineTo(13.453f, 10.584f)
                arcToRelative(1.485f, 1.485f, 0.0f, false, true, -0.019f, -2.117f)
                arcToRelative(1.49f, 1.49f, 0.0f, false, true, 2.068f, -0.067f)
                arcToRelative(1.49f, 1.49f, 0.0f, false, true, 2.065f, 0.033f)
                curveToRelative(0.597f, 0.591f, 0.605f, 1.521f, 0.018f, 2.118f)
                close()
            }
        }
        .build()
        return _bxsHappyHeartEyes!!
    }

private var _bxsHappyHeartEyes: ImageVector? = null
