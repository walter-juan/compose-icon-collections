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

public val SolidGroup.BxsBrush: ImageVector
    get() {
        if (_bxsBrush != null) {
            return _bxsBrush!!
        }
        _bxsBrush = Builder(name = "BxsBrush", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.207f, 11.278f)
                lineToRelative(-2.035f, -2.035f)
                lineToRelative(-1.415f, -1.415f)
                lineToRelative(-5.035f, -5.035f)
                arcToRelative(0.999f, 0.999f, 0.0f, false, false, -1.414f, 0.0f)
                lineTo(6.151f, 7.949f)
                lineTo(4.736f, 9.363f)
                arcToRelative(2.985f, 2.985f, 0.0f, false, false, -0.878f, 2.122f)
                curveToRelative(0.0f, 0.802f, 0.313f, 1.556f, 0.879f, 2.121f)
                lineToRelative(0.707f, 0.707f)
                lineToRelative(-2.122f, 2.122f)
                arcToRelative(2.925f, 2.925f, 0.0f, false, false, -0.873f, 2.108f)
                arcToRelative(2.968f, 2.968f, 0.0f, false, false, 1.063f, 2.308f)
                arcToRelative(2.92f, 2.92f, 0.0f, false, false, 1.886f, 0.681f)
                curveToRelative(0.834f, 0.0f, 1.654f, -0.341f, 2.25f, -0.937f)
                lineToRelative(2.039f, -2.039f)
                lineToRelative(0.707f, 0.706f)
                curveToRelative(1.133f, 1.133f, 3.107f, 1.134f, 4.242f, 0.001f)
                lineToRelative(0.708f, -0.707f)
                lineToRelative(0.569f, -0.569f)
                lineToRelative(0.138f, -0.138f)
                lineToRelative(5.156f, -5.157f)
                arcToRelative(0.999f, 0.999f, 0.0f, false, false, 0.0f, -1.414f)
                close()
                moveTo(13.93f, 17.143f)
                lineTo(13.222f, 17.849f)
                arcToRelative(1.021f, 1.021f, 0.0f, false, true, -1.414f, 0.0f)
                lineToRelative(-1.414f, -1.413f)
                arcToRelative(0.999f, 0.999f, 0.0f, false, false, -1.414f, 0.0f)
                lineToRelative(-2.746f, 2.745f)
                arcToRelative(1.192f, 1.192f, 0.0f, false, true, -0.836f, 0.352f)
                arcToRelative(0.914f, 0.914f, 0.0f, false, true, -0.595f, -0.208f)
                arcToRelative(0.981f, 0.981f, 0.0f, false, true, -0.354f, -0.782f)
                arcToRelative(0.955f, 0.955f, 0.0f, false, true, 0.287f, -0.692f)
                lineToRelative(2.829f, -2.829f)
                arcToRelative(0.999f, 0.999f, 0.0f, false, false, 0.0f, -1.414f)
                lineToRelative(-1.414f, -1.415f)
                curveToRelative(-0.189f, -0.188f, -0.293f, -0.438f, -0.293f, -0.706f)
                reflectiveCurveToRelative(0.104f, -0.519f, 0.293f, -0.708f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(3.536f, 3.536f)
                lineToRelative(3.536f, 3.535f)
                close()
            }
        }
        .build()
        return _bxsBrush!!
    }

private var _bxsBrush: ImageVector? = null
