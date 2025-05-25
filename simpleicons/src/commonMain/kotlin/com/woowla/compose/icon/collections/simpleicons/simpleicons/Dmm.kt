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

public val Simpleicons.Dmm: ImageVector
    get() {
        if (_dmm != null) {
            return _dmm!!
        }
        _dmm = Builder(name = "Dmm", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.525f, 0.46f)
                lineTo(0.0f, 0.46f)
                verticalLineToRelative(23.08f)
                horizontalLineToRelative(11.545f)
                curveTo(17.284f, 23.54f, 24.0f, 20.916f, 24.0f, 12.0f)
                reflectiveCurveTo(16.026f, 0.46f, 9.525f, 0.46f)
                close()
                moveTo(10.171f, 15.533f)
                lineTo(10.171f, 8.34f)
                curveToRelative(1.746f, 0.0f, 4.4f, 0.079f, 4.4f, 3.582f)
                curveToRelative(0.0f, 3.58f, -2.553f, 3.611f, -4.4f, 3.611f)
                close()
            }
        }
        .build()
        return _dmm!!
    }

private var _dmm: ImageVector? = null
