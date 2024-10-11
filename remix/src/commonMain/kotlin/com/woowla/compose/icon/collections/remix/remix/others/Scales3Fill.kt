package com.woowla.compose.icon.collections.remix.remix.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.OthersGroup

public val OthersGroup.Scales3Fill: ImageVector
    get() {
        if (_scales3Fill != null) {
            return _scales3Fill!!
        }
        _scales3Fill = Builder(name = "Scales3Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.998f, 2.0f)
                lineTo(12.998f, 3.278f)
                lineTo(17.999f, 4.946f)
                lineTo(21.631f, 3.735f)
                lineTo(22.263f, 5.632f)
                lineTo(19.232f, 6.643f)
                lineTo(22.327f, 15.155f)
                curveTo(21.235f, 16.292f, 19.7f, 17.0f, 17.999f, 17.0f)
                curveTo(16.298f, 17.0f, 14.762f, 16.292f, 13.67f, 15.155f)
                lineTo(16.764f, 6.643f)
                lineTo(12.998f, 5.387f)
                verticalLineTo(19.0f)
                horizontalLineTo(16.999f)
                verticalLineTo(21.0f)
                horizontalLineTo(6.999f)
                verticalLineTo(19.0f)
                horizontalLineTo(10.998f)
                verticalLineTo(5.387f)
                lineTo(7.232f, 6.643f)
                lineTo(10.327f, 15.155f)
                curveTo(9.235f, 16.292f, 7.7f, 17.0f, 5.999f, 17.0f)
                curveTo(4.298f, 17.0f, 2.762f, 16.292f, 1.67f, 15.155f)
                lineTo(4.764f, 6.643f)
                lineTo(1.734f, 5.632f)
                lineTo(2.366f, 3.735f)
                lineTo(5.999f, 4.946f)
                lineTo(10.998f, 3.278f)
                lineTo(10.998f, 2.0f)
                horizontalLineTo(12.998f)
                close()
                moveTo(17.999f, 9.103f)
                lineTo(16.581f, 13.0f)
                horizontalLineTo(19.416f)
                lineTo(17.999f, 9.103f)
                close()
                moveTo(5.999f, 9.103f)
                lineTo(4.581f, 13.0f)
                horizontalLineTo(7.416f)
                lineTo(5.999f, 9.103f)
                close()
            }
        }
        .build()
        return _scales3Fill!!
    }

private var _scales3Fill: ImageVector? = null
