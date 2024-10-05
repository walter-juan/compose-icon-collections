package com.woowla.compose.icon.collections.tabler.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.Asset: ImageVector
    get() {
        if (_asset != null) {
            return _asset!!
        }
        _asset = Builder(name = "Asset", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.86f, 3.91f)
                lineToRelative(-0.107f, 0.291f)
                lineToRelative(-0.046f, 0.093f)
                quadToRelative(-0.061f, 0.128f, -0.134f, 0.25f)
                lineToRelative(-6.476f, 11.909f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.066f, 0.104f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -13.031f, -3.557f)
                lineToRelative(0.004f, -0.24f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 3.342f, -5.732f)
                lineToRelative(0.256f, -0.15f)
                lineToRelative(11.705f, -6.355f)
                quadToRelative(0.18f, -0.123f, 0.378f, -0.22f)
                lineToRelative(0.215f, -0.096f)
                lineToRelative(0.136f, -0.048f)
                curveToRelative(0.302f, -0.103f, 0.627f, -0.159f, 0.964f, -0.159f)
                moveToRelative(-10.0f, 10.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.995f, 2.824f)
                lineToRelative(-0.005f, 0.176f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 3.0f, -3.0f)
                moveToRelative(7.04f, -6.512f)
                lineToRelative(-5.12f, 2.778f)
                arcToRelative(7.01f, 7.01f, 0.0f, false, true, 4.816f, 4.824f)
                lineToRelative(2.788f, -5.128f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.485f, -2.474f)
                moveToRelative(2.961f, -1.488f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.317f, 0.051f)
                lineToRelative(-0.31f, 0.17f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.465f, 1.325f)
                lineToRelative(0.072f, -0.13f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.91f, -1.416f)
            }
        }
        .build()
        return _asset!!
    }

private var _asset: ImageVector? = null
