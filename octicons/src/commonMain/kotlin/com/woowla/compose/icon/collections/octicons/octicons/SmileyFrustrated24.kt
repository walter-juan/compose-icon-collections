package com.woowla.compose.icon.collections.octicons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.octicons.Octicons

public val Octicons.SmileyFrustrated24: ImageVector
    get() {
        if (_smileyFrustrated24 != null) {
            return _smileyFrustrated24!!
        }
        _smileyFrustrated24 = Builder(name = "SmileyFrustrated24", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                curveToRelative(6.075f, 0.0f, 11.0f, 4.925f, 11.0f, 11.0f)
                reflectiveCurveToRelative(-4.925f, 11.0f, -11.0f, 11.0f)
                reflectiveCurveTo(1.0f, 18.075f, 1.0f, 12.0f)
                reflectiveCurveTo(5.925f, 1.0f, 12.0f, 1.0f)
                close()
                moveTo(12.0f, 2.5f)
                arcTo(9.5f, 9.5f, 0.0f, false, false, 2.5f, 12.0f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, false, 9.5f, 9.5f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, false, 9.5f, -9.5f)
                arcTo(9.5f, 9.5f, 0.0f, false, false, 12.0f, 2.5f)
                close()
                moveTo(12.0f, 12.75f)
                curveToRelative(3.487f, 0.0f, 4.935f, 2.772f, 5.227f, 3.943f)
                arcToRelative(0.748f, 0.748f, 0.0f, false, true, -0.727f, 0.932f)
                horizontalLineToRelative(-9.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.728f, -0.932f)
                curveTo(7.065f, 15.522f, 8.513f, 12.75f, 12.0f, 12.75f)
                close()
                moveTo(12.0f, 14.25f)
                curveToRelative(-1.785f, 0.0f, -2.832f, 1.0f, -3.363f, 1.875f)
                horizontalLineToRelative(6.726f)
                curveToRelative(-0.531f, -0.875f, -1.578f, -1.875f, -3.363f, -1.875f)
                close()
                moveTo(5.798f, 7.736f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.966f, -0.438f)
                lineToRelative(4.0f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.404f)
                lineToRelative(-4.0f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.528f, -1.404f)
                lineTo(8.363f, 9.5f)
                lineToRelative(-2.127f, -0.798f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.438f, -0.966f)
                close()
                moveTo(17.236f, 7.298f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.528f, 1.404f)
                lineToRelative(-2.127f, 0.798f)
                lineToRelative(2.127f, 0.798f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.528f, 1.404f)
                lineToRelative(-4.0f, -1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.404f)
                lineToRelative(4.0f, -1.5f)
                close()
            }
        }
        .build()
        return _smileyFrustrated24!!
    }

private var _smileyFrustrated24: ImageVector? = null
