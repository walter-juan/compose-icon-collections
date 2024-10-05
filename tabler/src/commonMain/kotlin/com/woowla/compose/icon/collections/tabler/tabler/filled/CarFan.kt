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

public val FilledGroup.CarFan: ImageVector
    get() {
        if (_carFan != null) {
            return _carFan!!
        }
        _carFan = Builder(name = "CarFan", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.363f, 2.068f)
                lineToRelative(4.912f, 1.914f)
                arcToRelative(2.7f, 2.7f, 0.0f, false, true, 0.68f, 4.646f)
                lineToRelative(-3.045f, 2.371f)
                lineToRelative(6.09f, 0.001f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.932f, 1.363f)
                lineToRelative(-1.914f, 4.912f)
                arcToRelative(2.7f, 2.7f, 0.0f, false, true, -4.646f, 0.68f)
                lineToRelative(-2.372f, -3.047f)
                verticalLineToRelative(6.092f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.363f, 0.932f)
                lineToRelative(-4.912f, -1.914f)
                arcToRelative(2.7f, 2.7f, 0.0f, false, true, -0.68f, -4.646f)
                lineToRelative(3.045f, -2.372f)
                horizontalLineToRelative(-6.09f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.932f, -1.363f)
                lineToRelative(1.914f, -4.912f)
                arcToRelative(2.7f, 2.7f, 0.0f, false, true, 4.646f, -0.68f)
                lineToRelative(2.371f, 3.044f)
                lineToRelative(0.001f, -6.089f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.363f, -0.932f)
            }
        }
        .build()
        return _carFan!!
    }

private var _carFan: ImageVector? = null
