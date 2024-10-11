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

public val HealthAndMedicalGroup.RestTimeLine: ImageVector
    get() {
        if (_restTimeLine != null) {
            return _restTimeLine!!
        }
        _restTimeLine = Builder(name = "RestTimeLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 6.0f)
                verticalLineTo(8.0f)
                curveTo(7.686f, 8.0f, 5.0f, 10.686f, 5.0f, 14.0f)
                curveTo(5.0f, 17.314f, 7.686f, 20.0f, 11.0f, 20.0f)
                curveTo(14.238f, 20.0f, 16.878f, 17.434f, 16.996f, 14.225f)
                lineTo(17.0f, 14.0f)
                horizontalLineTo(19.0f)
                curveTo(19.0f, 18.418f, 15.418f, 22.0f, 11.0f, 22.0f)
                curveTo(6.582f, 22.0f, 3.0f, 18.418f, 3.0f, 14.0f)
                curveTo(3.0f, 9.665f, 6.58f, 6.0f, 11.0f, 6.0f)
                close()
                moveTo(21.0f, 2.0f)
                verticalLineTo(4.0f)
                lineTo(15.673f, 10.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(10.0f)
                lineTo(18.326f, 4.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(21.0f)
                close()
            }
        }
        .build()
        return _restTimeLine!!
    }

private var _restTimeLine: ImageVector? = null
