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

public val Octicons.SmileyFrown24: ImageVector
    get() {
        if (_smileyFrown24 != null) {
            return _smileyFrown24!!
        }
        _smileyFrown24 = Builder(name = "SmileyFrown24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(12.0f, 14.344f)
                curveToRelative(1.207f, 0.0f, 2.123f, 0.404f, 2.736f, 0.813f)
                curveToRelative(0.306f, 0.204f, 0.537f, 0.409f, 0.695f, 0.567f)
                curveToRelative(0.079f, 0.079f, 0.141f, 0.147f, 0.184f, 0.198f)
                lineToRelative(0.052f, 0.062f)
                lineToRelative(0.026f, 0.035f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.196f, 0.905f)
                lineToRelative(-0.021f, -0.026f)
                arcToRelative(1.853f, 1.853f, 0.0f, false, false, -0.106f, -0.114f)
                curveToRelative(-0.1f, -0.1f, -0.255f, -0.238f, -0.466f, -0.379f)
                arcTo(3.383f, 3.383f, 0.0f, false, false, 12.0f, 15.844f)
                curveToRelative(-0.855f, 0.0f, -1.487f, 0.283f, -1.904f, 0.561f)
                arcToRelative(3.031f, 3.031f, 0.0f, false, false, -0.572f, 0.493f)
                lineToRelative(-0.021f, 0.026f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.047f, 0.144f)
                curveToRelative(-0.346f, -0.26f, -0.381f, -0.752f, -0.123f, -1.084f)
                curveToRelative(0.039f, -0.049f, 0.118f, -0.142f, 0.236f, -0.26f)
                curveToRelative(0.158f, -0.158f, 0.389f, -0.363f, 0.695f, -0.567f)
                arcTo(4.878f, 4.878f, 0.0f, false, true, 12.0f, 14.344f)
                close()
                moveTo(7.75f, 9.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 0.0f, 2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 0.0f, -2.5f)
                close()
                moveTo(16.25f, 9.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 0.0f, 2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 0.0f, -2.5f)
                close()
            }
        }
        .build()
        return _smileyFrown24!!
    }

private var _smileyFrown24: ImageVector? = null
