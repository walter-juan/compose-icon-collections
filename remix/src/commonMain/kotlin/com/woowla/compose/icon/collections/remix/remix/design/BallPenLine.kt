package com.woowla.compose.icon.collections.remix.remix.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.DesignGroup

public val DesignGroup.BallPenLine: ImageVector
    get() {
        if (_ballPenLine != null) {
            return _ballPenLine!!
        }
        _ballPenLine = Builder(name = "BallPenLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.849f, 11.698f)
                lineTo(17.142f, 10.991f)
                lineTo(7.243f, 20.891f)
                horizontalLineTo(3.0f)
                verticalLineTo(16.648f)
                lineTo(14.314f, 5.334f)
                lineTo(19.971f, 10.991f)
                curveTo(20.361f, 11.382f, 20.361f, 12.015f, 19.971f, 12.405f)
                lineTo(12.899f, 19.476f)
                lineTo(11.485f, 18.062f)
                lineTo(17.849f, 11.698f)
                close()
                moveTo(15.728f, 9.577f)
                lineTo(14.314f, 8.163f)
                lineTo(5.0f, 17.476f)
                verticalLineTo(18.891f)
                horizontalLineTo(6.414f)
                lineTo(15.728f, 9.577f)
                close()
                moveTo(18.556f, 2.506f)
                lineTo(21.385f, 5.334f)
                curveTo(21.775f, 5.725f, 21.775f, 6.358f, 21.385f, 6.749f)
                lineTo(19.971f, 8.163f)
                lineTo(15.728f, 3.92f)
                lineTo(17.142f, 2.506f)
                curveTo(17.533f, 2.115f, 18.166f, 2.115f, 18.556f, 2.506f)
                close()
            }
        }
        .build()
        return _ballPenLine!!
    }

private var _ballPenLine: ImageVector? = null
