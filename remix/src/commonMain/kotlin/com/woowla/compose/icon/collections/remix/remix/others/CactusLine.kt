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

public val OthersGroup.CactusLine: ImageVector
    get() {
        if (_cactusLine != null) {
            return _cactusLine!!
        }
        _cactusLine = Builder(name = "CactusLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.998f, 2.0f)
                curveTo(14.207f, 2.0f, 15.998f, 3.791f, 15.998f, 6.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(16.998f)
                curveTo(17.548f, 15.0f, 17.998f, 14.55f, 17.998f, 14.0f)
                verticalLineTo(8.0f)
                curveTo(17.998f, 7.448f, 18.446f, 7.0f, 18.998f, 7.0f)
                curveTo(19.55f, 7.0f, 19.998f, 7.448f, 19.998f, 8.0f)
                verticalLineTo(14.0f)
                curveTo(19.998f, 15.66f, 18.658f, 17.0f, 16.998f, 17.0f)
                horizontalLineTo(15.998f)
                verticalLineTo(20.0f)
                horizontalLineTo(17.998f)
                verticalLineTo(22.0f)
                horizontalLineTo(5.998f)
                verticalLineTo(20.0f)
                horizontalLineTo(7.998f)
                verticalLineTo(14.0f)
                horizontalLineTo(6.998f)
                curveTo(5.341f, 14.0f, 3.998f, 12.657f, 3.998f, 11.0f)
                verticalLineTo(9.0f)
                curveTo(3.998f, 8.448f, 4.446f, 8.0f, 4.998f, 8.0f)
                curveTo(5.55f, 8.0f, 5.998f, 8.448f, 5.998f, 9.0f)
                verticalLineTo(11.0f)
                curveTo(5.998f, 11.55f, 6.448f, 12.0f, 6.998f, 12.0f)
                horizontalLineTo(7.998f)
                verticalLineTo(6.0f)
                curveTo(7.998f, 3.791f, 9.789f, 2.0f, 11.998f, 2.0f)
                close()
                moveTo(11.998f, 4.0f)
                curveTo(10.894f, 4.0f, 9.998f, 4.895f, 9.998f, 6.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(13.998f)
                verticalLineTo(6.0f)
                curveTo(13.998f, 4.895f, 13.103f, 4.0f, 11.998f, 4.0f)
                close()
            }
        }
        .build()
        return _cactusLine!!
    }

private var _cactusLine: ImageVector? = null
