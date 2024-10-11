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

public val OthersGroup.GraduationCapFill: ImageVector
    get() {
        if (_graduationCapFill != null) {
            return _graduationCapFill!!
        }
        _graduationCapFill = Builder(name = "GraduationCapFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                lineTo(0.0f, 9.0f)
                lineTo(12.0f, 16.0f)
                lineTo(22.0f, 10.167f)
                verticalLineTo(17.5f)
                horizontalLineTo(24.0f)
                verticalLineTo(9.0f)
                lineTo(12.0f, 2.0f)
                close()
                moveTo(3.999f, 13.491f)
                verticalLineTo(18.0f)
                curveTo(5.823f, 20.429f, 8.728f, 22.0f, 12.0f, 22.0f)
                curveTo(15.271f, 22.0f, 18.176f, 20.429f, 20.0f, 18.0f)
                lineTo(20.0f, 13.491f)
                lineTo(12.0f, 18.158f)
                lineTo(3.999f, 13.491f)
                close()
            }
        }
        .build()
        return _graduationCapFill!!
    }

private var _graduationCapFill: ImageVector? = null
