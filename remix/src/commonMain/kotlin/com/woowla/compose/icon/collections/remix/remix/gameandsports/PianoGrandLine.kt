package com.woowla.compose.icon.collections.remix.remix.gameandsports

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.GameAndSportsGroup

public val GameAndSportsGroup.PianoGrandLine: ImageVector
    get() {
        if (_pianoGrandLine != null) {
            return _pianoGrandLine!!
        }
        _pianoGrandLine = Builder(name = "PianoGrandLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 2.0f)
                curveTo(11.429f, 2.0f, 13.569f, 3.239f, 14.823f, 5.114f)
                curveTo(15.17f, 5.632f, 15.739f, 6.013f, 16.355f, 6.139f)
                curveTo(19.517f, 6.783f, 22.0f, 9.614f, 22.0f, 13.0f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 20.552f, 21.552f, 21.0f, 21.0f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 21.0f, 2.0f, 20.552f, 2.0f, 20.0f)
                verticalLineTo(9.0f)
                curveTo(2.0f, 5.134f, 5.134f, 2.0f, 9.0f, 2.0f)
                close()
                moveTo(4.0f, 19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(9.0f, 4.0f)
                curveTo(6.239f, 4.0f, 4.0f, 6.239f, 4.0f, 9.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(19.895f)
                curveTo(19.483f, 10.056f, 17.904f, 8.496f, 15.956f, 8.099f)
                curveTo(14.829f, 7.869f, 13.803f, 7.187f, 13.16f, 6.226f)
                curveTo(12.262f, 4.882f, 10.734f, 4.0f, 9.0f, 4.0f)
                close()
            }
        }
        .build()
        return _pianoGrandLine!!
    }

private var _pianoGrandLine: ImageVector? = null
