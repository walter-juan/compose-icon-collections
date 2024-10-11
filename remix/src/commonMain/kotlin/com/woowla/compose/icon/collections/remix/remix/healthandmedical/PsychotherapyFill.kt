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

public val HealthAndMedicalGroup.PsychotherapyFill: ImageVector
    get() {
        if (_psychotherapyFill != null) {
            return _psychotherapyFill!!
        }
        _psychotherapyFill = Builder(name = "PsychotherapyFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 2.0f)
                curveTo(15.068f, 2.0f, 18.426f, 5.036f, 18.934f, 8.965f)
                lineTo(21.184f, 12.504f)
                curveTo(21.332f, 12.737f, 21.302f, 13.085f, 20.959f, 13.232f)
                lineTo(19.0f, 14.071f)
                verticalLineTo(17.0f)
                curveTo(19.0f, 18.105f, 18.105f, 19.0f, 17.0f, 19.0f)
                horizontalLineTo(15.001f)
                lineTo(15.0f, 22.0f)
                horizontalLineTo(6.0f)
                lineTo(6.0f, 18.306f)
                curveTo(6.0f, 17.125f, 5.564f, 16.009f, 4.755f, 15.001f)
                curveTo(3.657f, 13.631f, 3.0f, 11.892f, 3.0f, 10.0f)
                curveTo(3.0f, 5.582f, 6.582f, 2.0f, 11.0f, 2.0f)
                close()
                moveTo(11.0f, 7.0f)
                curveTo(10.448f, 7.0f, 10.0f, 7.448f, 10.0f, 8.0f)
                verticalLineTo(8.999f)
                lineTo(9.0f, 9.0f)
                curveTo(8.448f, 9.0f, 8.0f, 9.448f, 8.0f, 10.0f)
                curveTo(8.0f, 10.552f, 8.448f, 11.0f, 9.0f, 11.0f)
                lineTo(10.0f, 10.999f)
                verticalLineTo(12.0f)
                curveTo(10.0f, 12.552f, 10.448f, 13.0f, 11.0f, 13.0f)
                curveTo(11.552f, 13.0f, 12.0f, 12.552f, 12.0f, 12.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(13.0f)
                curveTo(13.552f, 11.0f, 14.0f, 10.552f, 14.0f, 10.0f)
                curveTo(14.0f, 9.448f, 13.552f, 9.0f, 13.0f, 9.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(8.0f)
                curveTo(12.0f, 7.448f, 11.552f, 7.0f, 11.0f, 7.0f)
                close()
            }
        }
        .build()
        return _psychotherapyFill!!
    }

private var _psychotherapyFill: ImageVector? = null
