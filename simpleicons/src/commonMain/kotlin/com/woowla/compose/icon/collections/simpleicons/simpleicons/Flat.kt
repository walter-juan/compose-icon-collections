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

public val Simpleicons.Flat: ImageVector
    get() {
        if (_flat != null) {
            return _flat!!
        }
        _flat = Builder(name = "Flat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.545f, 17.455f)
                verticalLineToRelative(3.273f)
                curveTo(6.545f, 22.535f, 5.08f, 24.0f, 3.273f, 24.0f)
                reflectiveCurveTo(0.0f, 22.535f, 0.0f, 20.727f)
                curveToRelative(0.0f, -1.808f, 1.465f, -3.273f, 3.273f, -3.273f)
                close()
                moveTo(15.273f, 8.727f)
                lineTo(15.273f, 12.0f)
                curveToRelative(0.0f, 1.808f, -1.465f, 3.273f, -3.273f, 3.273f)
                lineTo(5.455f, 15.273f)
                curveToRelative(-1.807f, 0.0f, -3.273f, -1.465f, -3.273f, -3.273f)
                curveToRelative(0.0f, -1.808f, 1.465f, -3.273f, 3.273f, -3.273f)
                close()
                moveTo(24.0f, 0.0f)
                verticalLineToRelative(3.273f)
                curveToRelative(0.0f, 1.808f, -1.465f, 3.273f, -3.273f, 3.273f)
                lineTo(7.636f, 6.545f)
                curveToRelative(-1.807f, 0.0f, -3.273f, -1.465f, -3.273f, -3.273f)
                reflectiveCurveTo(5.829f, 0.0f, 7.636f, 0.0f)
                close()
            }
        }
        .build()
        return _flat!!
    }

private var _flat: ImageVector? = null
