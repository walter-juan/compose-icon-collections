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

public val OthersGroup.DoorClosedLine: ImageVector
    get() {
        if (_doorClosedLine != null) {
            return _doorClosedLine!!
        }
        _doorClosedLine = Builder(name = "DoorClosedLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.998f, 21.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(4.998f)
                verticalLineTo(4.0f)
                curveTo(4.998f, 3.448f, 5.446f, 3.0f, 5.998f, 3.0f)
                horizontalLineTo(17.998f)
                curveTo(18.55f, 3.0f, 18.998f, 3.448f, 18.998f, 4.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.998f)
                verticalLineTo(21.0f)
                horizontalLineTo(2.998f)
                close()
                moveTo(16.998f, 5.0f)
                horizontalLineTo(6.998f)
                verticalLineTo(19.0f)
                horizontalLineTo(16.998f)
                verticalLineTo(5.0f)
                close()
                moveTo(14.998f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(12.998f)
                verticalLineTo(11.0f)
                horizontalLineTo(14.998f)
                close()
            }
        }
        .build()
        return _doorClosedLine!!
    }

private var _doorClosedLine: ImageVector? = null
