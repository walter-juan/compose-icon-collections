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

public val FilledGroup.ManualGearbox: ImageVector
    get() {
        if (_manualGearbox != null) {
            return _manualGearbox!!
        }
        _manualGearbox = Builder(name = "ManualGearbox", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 1.0f, 5.829f)
                verticalLineToRelative(1.171f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.171f)
                arcToRelative(3.001f, 3.001f, 0.0f, true, true, -4.0f, 2.829f)
                lineToRelative(0.005f, -0.176f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 1.995f, -2.654f)
                verticalLineToRelative(-2.17f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(2.171f)
                arcToRelative(3.001f, 3.001f, 0.0f, true, true, -4.0f, 2.829f)
                lineToRelative(0.005f, -0.176f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 1.995f, -2.654f)
                verticalLineToRelative(-6.341f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.0f, -2.829f)
                lineToRelative(0.005f, -0.176f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 3.996f, 3.005f)
                lineToRelative(-0.001f, 2.171f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.17f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.0f, -2.83f)
                lineToRelative(0.005f, -0.176f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 3.996f, 3.005f)
                lineToRelative(-0.001f, 2.171f)
                horizontalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-1.17f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.0f, -2.83f)
                lineToRelative(0.005f, -0.176f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.995f, -2.824f)
            }
        }
        .build()
        return _manualGearbox!!
    }

private var _manualGearbox: ImageVector? = null
