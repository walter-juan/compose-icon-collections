package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.AtSymbol: ImageVector
    get() {
        if (_atSymbol != null) {
            return _atSymbol!!
        }
        _atSymbol = Builder(name = "AtSymbol", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.834f, 6.166f)
                curveTo(14.612f, 2.945f, 9.388f, 2.945f, 6.166f, 6.166f)
                curveTo(2.945f, 9.388f, 2.945f, 14.612f, 6.166f, 17.834f)
                curveTo(9.388f, 21.056f, 14.612f, 21.056f, 17.834f, 17.834f)
                curveTo(18.126f, 17.541f, 18.601f, 17.541f, 18.894f, 17.834f)
                curveTo(19.187f, 18.126f, 19.187f, 18.601f, 18.894f, 18.894f)
                curveTo(15.087f, 22.702f, 8.913f, 22.702f, 5.106f, 18.894f)
                curveTo(1.298f, 15.087f, 1.298f, 8.913f, 5.106f, 5.106f)
                curveTo(8.913f, 1.298f, 15.087f, 1.298f, 18.894f, 5.106f)
                curveTo(20.798f, 7.009f, 21.75f, 9.506f, 21.75f, 12.0f)
                curveTo(21.75f, 12.975f, 21.455f, 13.887f, 20.941f, 14.571f)
                curveTo(20.427f, 15.256f, 19.66f, 15.75f, 18.75f, 15.75f)
                curveTo(17.846f, 15.75f, 17.084f, 15.263f, 16.57f, 14.586f)
                curveTo(15.668f, 16.177f, 13.959f, 17.25f, 12.0f, 17.25f)
                curveTo(9.101f, 17.25f, 6.75f, 14.899f, 6.75f, 12.0f)
                curveTo(6.75f, 9.101f, 9.101f, 6.75f, 12.0f, 6.75f)
                curveTo(13.469f, 6.75f, 14.797f, 7.353f, 15.75f, 8.326f)
                verticalLineTo(8.25f)
                curveTo(15.75f, 7.836f, 16.086f, 7.5f, 16.5f, 7.5f)
                curveTo(16.914f, 7.5f, 17.25f, 7.836f, 17.25f, 8.25f)
                verticalLineTo(12.0f)
                curveTo(17.25f, 12.682f, 17.458f, 13.27f, 17.759f, 13.671f)
                curveTo(18.06f, 14.072f, 18.418f, 14.25f, 18.75f, 14.25f)
                curveTo(19.082f, 14.25f, 19.44f, 14.072f, 19.741f, 13.671f)
                curveTo(20.042f, 13.27f, 20.25f, 12.682f, 20.25f, 12.0f)
                curveTo(20.25f, 9.887f, 19.445f, 7.777f, 17.834f, 6.166f)
                close()
                moveTo(15.75f, 12.0f)
                curveTo(15.75f, 9.929f, 14.071f, 8.25f, 12.0f, 8.25f)
                curveTo(9.929f, 8.25f, 8.25f, 9.929f, 8.25f, 12.0f)
                curveTo(8.25f, 14.071f, 9.929f, 15.75f, 12.0f, 15.75f)
                curveTo(14.071f, 15.75f, 15.75f, 14.071f, 15.75f, 12.0f)
                close()
            }
        }
        .build()
        return _atSymbol!!
    }

private var _atSymbol: ImageVector? = null
