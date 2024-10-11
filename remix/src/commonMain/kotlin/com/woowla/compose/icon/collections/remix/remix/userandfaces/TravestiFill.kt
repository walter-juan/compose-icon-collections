package com.woowla.compose.icon.collections.remix.remix.userandfaces

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.UserAndFacesGroup

public val UserAndFacesGroup.TravestiFill: ImageVector
    get() {
        if (_travestiFill != null) {
            return _travestiFill!!
        }
        _travestiFill = Builder(name = "TravestiFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.537f, 9.951f)
                lineTo(4.662f, 7.075f)
                lineTo(2.187f, 9.55f)
                lineTo(0.772f, 8.136f)
                lineTo(7.136f, 1.772f)
                lineTo(8.551f, 3.186f)
                lineTo(6.076f, 5.661f)
                lineTo(8.951f, 8.537f)
                curveTo(10.213f, 7.573f, 11.79f, 7.0f, 13.5f, 7.0f)
                curveTo(17.642f, 7.0f, 21.0f, 10.358f, 21.0f, 14.5f)
                curveTo(21.0f, 18.642f, 17.642f, 22.0f, 13.5f, 22.0f)
                curveTo(9.358f, 22.0f, 6.0f, 18.642f, 6.0f, 14.5f)
                curveTo(6.0f, 12.79f, 6.573f, 11.213f, 7.537f, 9.951f)
                close()
            }
        }
        .build()
        return _travestiFill!!
    }

private var _travestiFill: ImageVector? = null
