package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Downdetector: ImageVector
    get() {
        if (_downdetector != null) {
            return _downdetector!!
        }
        _downdetector = Builder(name = "Downdetector", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.49f, 0.0f, 0.257f, 5.362f, 0.257f, 12.0f)
                verticalLineToRelative(12.0f)
                lineTo(12.0f, 24.0f)
                curveToRelative(6.51f, 0.0f, 11.743f, -5.362f, 11.743f, -12.0f)
                reflectiveCurveTo(18.51f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 3.51f)
                curveToRelative(0.543f, 0.0f, 1.086f, 0.065f, 1.66f, 0.192f)
                curveToRelative(0.383f, 0.128f, 0.639f, 0.383f, 0.639f, 0.766f)
                lineToRelative(-0.638f, 10.085f)
                curveToRelative(0.0f, 0.255f, -0.256f, 0.511f, -0.512f, 0.511f)
                curveToRelative(-0.766f, 0.128f, -1.533f, 0.128f, -2.171f, 0.0f)
                curveToRelative(-0.383f, 0.0f, -0.639f, -0.256f, -0.639f, -0.51f)
                lineTo(9.701f, 4.467f)
                curveToRelative(0.0f, -0.383f, 0.256f, -0.638f, 0.638f, -0.766f)
                arcTo(7.583f, 7.583f, 0.0f, false, true, 12.0f, 3.51f)
                close()
                moveTo(12.065f, 16.5f)
                curveToRelative(0.447f, 0.0f, 0.892f, 0.031f, 1.339f, 0.095f)
                curveToRelative(0.255f, 0.0f, 0.384f, 0.256f, 0.384f, 0.384f)
                curveToRelative(0.127f, 0.894f, 0.127f, 1.786f, 0.0f, 2.807f)
                curveToRelative(0.0f, 0.256f, -0.257f, 0.384f, -0.384f, 0.384f)
                arcToRelative(9.427f, 9.427f, 0.0f, false, true, -2.68f, 0.0f)
                curveToRelative(-0.256f, 0.0f, -0.384f, -0.256f, -0.384f, -0.384f)
                curveToRelative(-0.128f, -0.893f, -0.128f, -1.786f, 0.0f, -2.807f)
                curveToRelative(0.0f, -0.255f, 0.256f, -0.384f, 0.383f, -0.384f)
                arcToRelative(9.478f, 9.478f, 0.0f, false, true, 1.342f, -0.095f)
                close()
            }
        }
        .build()
        return _downdetector!!
    }

private var _downdetector: ImageVector? = null
