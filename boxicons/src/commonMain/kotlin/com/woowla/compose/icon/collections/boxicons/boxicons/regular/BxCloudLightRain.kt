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

public val RegularGroup.BxCloudLightRain: ImageVector
    get() {
        if (_bxCloudLightRain != null) {
            return _bxCloudLightRain!!
        }
        _bxCloudLightRain = Builder(name = "BxCloudLightRain", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 13.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                lineTo(8.0f, 17.0f)
                close()
                moveTo(8.0f, 18.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                lineTo(8.0f, 20.0f)
                close()
                moveTo(11.0f, 15.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(11.0f, 20.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(14.0f, 13.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(14.0f, 18.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.944f, 10.112f)
                curveTo(18.507f, 6.67f, 15.56f, 4.0f, 12.0f, 4.0f)
                curveTo(9.244f, 4.0f, 6.85f, 5.611f, 5.757f, 8.15f)
                curveTo(3.609f, 8.792f, 2.0f, 10.819f, 2.0f, 13.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                curveToRelative(0.0f, -1.403f, 1.199f, -2.756f, 2.673f, -3.015f)
                lineToRelative(0.581f, -0.103f)
                lineToRelative(0.192f, -0.559f)
                curveTo(8.149f, 7.273f, 9.895f, 6.0f, 12.0f, 6.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                arcToRelative(4.008f, 4.008f, 0.0f, false, false, -3.056f, -3.888f)
                close()
            }
        }
        .build()
        return _bxCloudLightRain!!
    }

private var _bxCloudLightRain: ImageVector? = null
