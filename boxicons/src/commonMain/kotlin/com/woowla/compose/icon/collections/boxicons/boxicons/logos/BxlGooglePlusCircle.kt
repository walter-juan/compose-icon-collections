package com.woowla.compose.icon.collections.boxicons.boxicons.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.LogosGroup

public val LogosGroup.BxlGooglePlusCircle: ImageVector
    get() {
        if (_bxlGooglePlusCircle != null) {
            return _bxlGooglePlusCircle!!
        }
        _bxlGooglePlusCircle = Builder(name = "BxlGooglePlusCircle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.014f, 11.974f)
                curveTo(21.996f, 6.462f, 17.521f, 2.0f, 12.008f, 2.0f)
                curveTo(6.493f, 2.0f, 2.019f, 6.462f, 2.001f, 11.974f)
                lineTo(2.0f, 11.948f)
                verticalLineToRelative(0.112f)
                lineToRelative(0.001f, -0.023f)
                curveToRelative(0.017f, 5.513f, 4.491f, 9.977f, 10.007f, 9.977f)
                curveToRelative(5.514f, 0.0f, 9.988f, -4.462f, 10.006f, -9.974f)
                lineToRelative(0.001f, 0.026f)
                verticalLineToRelative(-0.118f)
                lineToRelative(-0.001f, 0.026f)
                close()
                moveTo(9.281f, 16.557f)
                curveToRelative(-2.509f, 0.0f, -4.548f, -2.039f, -4.548f, -4.549f)
                reflectiveCurveToRelative(2.039f, -4.549f, 4.548f, -4.549f)
                curveToRelative(1.23f, 0.0f, 2.258f, 0.451f, 3.046f, 1.188f)
                lineToRelative(-1.295f, 1.255f)
                curveToRelative(-0.325f, -0.309f, -0.899f, -0.673f, -1.751f, -0.673f)
                curveToRelative(-1.505f, 0.0f, -2.733f, 1.251f, -2.733f, 2.785f)
                curveToRelative(0.0f, 1.533f, 1.229f, 2.784f, 2.733f, 2.784f)
                curveToRelative(1.742f, 0.0f, 2.384f, -1.206f, 2.502f, -1.92f)
                lineTo(9.279f, 12.878f)
                lineTo(9.279f, 11.18f)
                horizontalLineToRelative(4.255f)
                curveToRelative(0.066f, 0.286f, 0.115f, 0.554f, 0.115f, 0.932f)
                curveToRelative(0.0f, 2.597f, -1.742f, 4.445f, -4.368f, 4.445f)
                close()
                moveTo(19.739f, 12.462f)
                lineTo(17.92f, 12.462f)
                verticalLineToRelative(1.819f)
                horizontalLineToRelative(-1.364f)
                verticalLineToRelative(-1.819f)
                horizontalLineToRelative(-1.82f)
                verticalLineToRelative(-1.364f)
                horizontalLineToRelative(1.82f)
                verticalLineToRelative(-1.82f)
                horizontalLineToRelative(1.364f)
                verticalLineToRelative(1.82f)
                horizontalLineToRelative(1.819f)
                verticalLineToRelative(1.364f)
                close()
            }
        }
        .build()
        return _bxlGooglePlusCircle!!
    }

private var _bxlGooglePlusCircle: ImageVector? = null
