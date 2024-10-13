package com.woowla.compose.icon.collections.boxicons.boxicons.regular

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
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxHappyHeartEyes: ImageVector
    get() {
        if (_bxHappyHeartEyes != null) {
            return _bxHappyHeartEyes!!
        }
        _bxHappyHeartEyes = Builder(name = "BxHappyHeartEyes", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 18.0f)
                curveToRelative(4.0f, 0.0f, 5.0f, -4.0f, 5.0f, -4.0f)
                horizontalLineTo(7.0f)
                reflectiveCurveToRelative(1.0f, 4.0f, 5.0f, 4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveToRelative(5.514f, 0.0f, 10.0f, -4.486f, 10.0f, -10.0f)
                reflectiveCurveTo(17.514f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(2.0f, 6.486f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                close()
                moveTo(12.0f, 4.0f)
                curveToRelative(4.411f, 0.0f, 8.0f, 3.589f, 8.0f, 8.0f)
                reflectiveCurveToRelative(-3.589f, 8.0f, -8.0f, 8.0f)
                reflectiveCurveToRelative(-8.0f, -3.589f, -8.0f, -8.0f)
                reflectiveCurveToRelative(3.589f, -8.0f, 8.0f, -8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.535f, 12.634f)
                lineToRelative(2.05f, -2.083f)
                arcToRelative(1.485f, 1.485f, 0.0f, false, false, -0.018f, -2.118f)
                arcToRelative(1.49f, 1.49f, 0.0f, false, false, -2.065f, -0.034f)
                arcToRelative(1.488f, 1.488f, 0.0f, false, false, -2.067f, 0.068f)
                curveToRelative(-0.586f, 0.6f, -0.579f, 1.53f, 0.019f, 2.117f)
                lineToRelative(2.081f, 2.05f)
                close()
                moveTo(15.535f, 12.634f)
                lineTo(17.585f, 10.551f)
                arcToRelative(1.485f, 1.485f, 0.0f, false, false, -0.018f, -2.118f)
                arcToRelative(1.49f, 1.49f, 0.0f, false, false, -2.065f, -0.034f)
                arcToRelative(1.488f, 1.488f, 0.0f, false, false, -2.068f, 0.067f)
                curveToRelative(-0.586f, 0.6f, -0.579f, 1.53f, 0.019f, 2.117f)
                lineToRelative(2.082f, 2.051f)
                close()
            }
        }
        .build()
        return _bxHappyHeartEyes!!
    }

private var _bxHappyHeartEyes: ImageVector? = null
