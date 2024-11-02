package com.woowla.compose.icon.collections.heroicons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.OutlineGroup

public val OutlineGroup.LightBulb: ImageVector
    get() {
        if (_lightBulb != null) {
            return _lightBulb!!
        }
        _lightBulb = Builder(name = "LightBulb", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 18.0f)
                verticalLineTo(12.75f)
                moveTo(12.0f, 12.75f)
                curveTo(12.518f, 12.75f, 13.021f, 12.684f, 13.5f, 12.561f)
                moveTo(12.0f, 12.75f)
                curveTo(11.482f, 12.75f, 10.979f, 12.684f, 10.5f, 12.561f)
                moveTo(14.25f, 20.039f)
                curveTo(13.521f, 20.178f, 12.769f, 20.25f, 12.0f, 20.25f)
                curveTo(11.231f, 20.25f, 10.479f, 20.178f, 9.75f, 20.039f)
                moveTo(13.5f, 22.422f)
                curveTo(13.007f, 22.474f, 12.507f, 22.5f, 12.0f, 22.5f)
                curveTo(11.493f, 22.5f, 10.993f, 22.474f, 10.5f, 22.422f)
                moveTo(14.25f, 18.0f)
                verticalLineTo(17.808f)
                curveTo(14.25f, 16.825f, 14.908f, 15.985f, 15.759f, 15.492f)
                curveTo(17.996f, 14.194f, 19.5f, 11.773f, 19.5f, 9.0f)
                curveTo(19.5f, 4.858f, 16.142f, 1.5f, 12.0f, 1.5f)
                curveTo(7.858f, 1.5f, 4.5f, 4.858f, 4.5f, 9.0f)
                curveTo(4.5f, 11.773f, 6.004f, 14.194f, 8.242f, 15.492f)
                curveTo(9.092f, 15.985f, 9.75f, 16.825f, 9.75f, 17.808f)
                verticalLineTo(18.0f)
            }
        }
        .build()
        return _lightBulb!!
    }

private var _lightBulb: ImageVector? = null
