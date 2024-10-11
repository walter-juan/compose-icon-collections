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

public val EditorGroup.InfoI: ImageVector
    get() {
        if (_infoI != null) {
            return _infoI!!
        }
        _infoI = Builder(name = "InfoI", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                curveTo(12.828f, 6.0f, 13.5f, 5.328f, 13.5f, 4.5f)
                curveTo(13.5f, 3.672f, 12.828f, 3.0f, 12.0f, 3.0f)
                curveTo(11.172f, 3.0f, 10.5f, 3.672f, 10.5f, 4.5f)
                curveTo(10.5f, 5.328f, 11.172f, 6.0f, 12.0f, 6.0f)
                close()
                moveTo(9.0f, 10.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _infoI!!
    }

private var _infoI: ImageVector? = null
