package com.woowla.compose.icon.collections.remix.remix.editor

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.EditorGroup

public val EditorGroup.SendBackward: ImageVector
    get() {
        if (_sendBackward != null) {
            return _sendBackward!!
        }
        _sendBackward = Builder(name = "SendBackward", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 3.0f)
                curveTo(14.552f, 3.0f, 15.0f, 3.448f, 15.0f, 4.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(20.0f)
                curveTo(20.552f, 9.0f, 21.0f, 9.448f, 21.0f, 10.0f)
                verticalLineTo(20.0f)
                curveTo(21.0f, 20.552f, 20.552f, 21.0f, 20.0f, 21.0f)
                horizontalLineTo(10.0f)
                curveTo(9.448f, 21.0f, 9.0f, 20.552f, 9.0f, 20.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 15.0f, 3.0f, 14.552f, 3.0f, 14.0f)
                verticalLineTo(4.0f)
                curveTo(3.0f, 3.448f, 3.448f, 3.0f, 4.0f, 3.0f)
                horizontalLineTo(14.0f)
                close()
                moveTo(13.0f, 5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(10.0f)
                curveTo(9.0f, 9.448f, 9.448f, 9.0f, 10.0f, 9.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _sendBackward!!
    }

private var _sendBackward: ImageVector? = null
