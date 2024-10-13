package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsHeartCircle: ImageVector
    get() {
        if (_bxsHeartCircle != null) {
            return _bxsHeartCircle!!
        }
        _bxsHeartCircle = Builder(name = "BxsHeartCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.486f, 2.0f, 2.0f, 6.486f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.486f, 10.0f, -10.0f)
                reflectiveCurveTo(17.514f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(16.186f, 12.74f)
                lineTo(12.0f, 16.926f)
                lineTo(7.814f, 12.74f)
                arcToRelative(2.745f, 2.745f, 0.0f, false, true, 0.0f, -3.907f)
                arcToRelative(2.745f, 2.745f, 0.0f, false, true, 3.906f, 0.0f)
                lineToRelative(0.28f, 0.279f)
                lineToRelative(0.279f, -0.279f)
                arcToRelative(2.745f, 2.745f, 0.0f, false, true, 3.906f, 0.0f)
                arcToRelative(2.745f, 2.745f, 0.0f, false, true, 0.001f, 3.907f)
                close()
            }
        }
        .build()
        return _bxsHeartCircle!!
    }

private var _bxsHeartCircle: ImageVector? = null
