package com.woowla.compose.icon.collections.remix.remix.healthandmedical

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.HealthAndMedicalGroup

public val HealthAndMedicalGroup.AedElectrodesFill: ImageVector
    get() {
        if (_aedElectrodesFill != null) {
            return _aedElectrodesFill!!
        }
        _aedElectrodesFill = Builder(name = "AedElectrodesFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 3.0f)
                curveTo(7.448f, 3.0f, 7.0f, 3.448f, 7.0f, 4.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 7.0f, 3.0f, 7.448f, 3.0f, 8.0f)
                verticalLineTo(20.0f)
                curveTo(3.0f, 20.552f, 3.448f, 21.0f, 4.0f, 21.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(16.0f)
                curveTo(16.552f, 21.0f, 17.0f, 20.552f, 17.0f, 20.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(20.0f)
                curveTo(20.552f, 17.0f, 21.0f, 16.552f, 21.0f, 16.0f)
                verticalLineTo(4.0f)
                curveTo(21.0f, 3.448f, 20.552f, 3.0f, 20.0f, 3.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(17.0f, 15.0f)
                verticalLineTo(8.0f)
                curveTo(17.0f, 7.448f, 16.552f, 7.0f, 16.0f, 7.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _aedElectrodesFill!!
    }

private var _aedElectrodesFill: ImageVector? = null
