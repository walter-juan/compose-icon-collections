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

public val Simpleicons.Wagmi: ImageVector
    get() {
        if (_wagmi != null) {
            return _wagmi!!
        }
        _wagmi = Builder(name = "Wagmi", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.739f, 13.207f)
                curveToRelative(0.0f, 0.756f, 0.613f, 1.37f, 1.37f, 1.37f)
                horizontalLineToRelative(2.739f)
                curveToRelative(0.756f, 0.0f, 1.37f, -0.613f, 1.37f, -1.37f)
                lineTo(8.217f, 7.728f)
                curveToRelative(0.0f, -0.756f, 0.613f, -1.37f, 1.37f, -1.37f)
                reflectiveCurveToRelative(1.37f, 0.613f, 1.37f, 1.37f)
                verticalLineToRelative(5.478f)
                curveToRelative(0.0f, 0.756f, 0.613f, 1.37f, 1.37f, 1.37f)
                horizontalLineToRelative(2.739f)
                curveToRelative(0.756f, 0.0f, 1.37f, -0.613f, 1.37f, -1.37f)
                lineTo(16.435f, 7.728f)
                curveToRelative(0.0f, -0.756f, 0.613f, -1.37f, 1.37f, -1.37f)
                reflectiveCurveToRelative(1.37f, 0.613f, 1.37f, 1.37f)
                verticalLineToRelative(8.217f)
                curveToRelative(0.0f, 0.756f, -0.613f, 1.37f, -1.37f, 1.37f)
                lineTo(1.37f, 17.315f)
                curveTo(0.613f, 17.315f, 0.0f, 16.702f, 0.0f, 15.946f)
                lineTo(0.0f, 7.728f)
                curveToRelative(0.0f, -0.756f, 0.613f, -1.37f, 1.37f, -1.37f)
                reflectiveCurveToRelative(1.37f, 0.613f, 1.37f, 1.37f)
                close()
                moveTo(22.174f, 17.641f)
                curveToRelative(1.008f, 0.0f, 1.826f, -0.818f, 1.826f, -1.826f)
                curveToRelative(0.0f, -1.009f, -0.818f, -1.826f, -1.826f, -1.826f)
                curveToRelative(-1.009f, 0.0f, -1.826f, 0.818f, -1.826f, 1.826f)
                curveToRelative(0.0f, 1.008f, 0.818f, 1.826f, 1.826f, 1.826f)
                close()
            }
        }
        .build()
        return _wagmi!!
    }

private var _wagmi: ImageVector? = null
