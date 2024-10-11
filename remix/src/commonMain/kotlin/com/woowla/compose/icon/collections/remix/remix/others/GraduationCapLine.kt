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

public val OthersGroup.GraduationCapLine: ImageVector
    get() {
        if (_graduationCapLine != null) {
            return _graduationCapLine!!
        }
        _graduationCapLine = Builder(name = "GraduationCapLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 11.333f)
                lineTo(0.0f, 9.0f)
                lineTo(12.0f, 2.0f)
                lineTo(24.0f, 9.0f)
                verticalLineTo(17.5f)
                horizontalLineTo(22.0f)
                verticalLineTo(10.167f)
                lineTo(20.0f, 11.333f)
                verticalLineTo(18.011f)
                lineTo(19.777f, 18.286f)
                curveTo(17.946f, 20.55f, 15.142f, 22.0f, 12.0f, 22.0f)
                curveTo(8.858f, 22.0f, 6.054f, 20.55f, 4.223f, 18.286f)
                lineTo(4.0f, 18.011f)
                verticalLineTo(11.333f)
                close()
                moveTo(6.0f, 12.5f)
                verticalLineTo(17.292f)
                curveTo(7.467f, 18.954f, 9.611f, 20.0f, 12.0f, 20.0f)
                curveTo(14.389f, 20.0f, 16.533f, 18.954f, 18.0f, 17.292f)
                verticalLineTo(12.5f)
                lineTo(12.0f, 16.0f)
                lineTo(6.0f, 12.5f)
                close()
                moveTo(3.969f, 9.0f)
                lineTo(12.0f, 13.685f)
                lineTo(20.031f, 9.0f)
                lineTo(12.0f, 4.315f)
                lineTo(3.969f, 9.0f)
                close()
            }
        }
        .build()
        return _graduationCapLine!!
    }

private var _graduationCapLine: ImageVector? = null
