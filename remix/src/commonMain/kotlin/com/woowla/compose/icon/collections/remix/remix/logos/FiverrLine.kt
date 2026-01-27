package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.FiverrLine: ImageVector
    get() {
        if (_fiverrLine != null) {
            return _fiverrLine!!
        }
        _fiverrLine = Builder(name = "FiverrLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 4.0f)
                curveTo(7.582f, 4.0f, 4.0f, 7.582f, 4.0f, 12.0f)
                curveTo(4.0f, 16.418f, 7.582f, 20.0f, 12.0f, 20.0f)
                curveTo(16.418f, 20.0f, 20.0f, 16.418f, 20.0f, 12.0f)
                curveTo(20.0f, 7.582f, 16.418f, 4.0f, 12.0f, 4.0f)
                close()
                moveTo(13.679f, 7.927f)
                horizontalLineTo(12.179f)
                curveTo(11.622f, 7.927f, 11.235f, 8.27f, 11.235f, 8.784f)
                verticalLineTo(9.256f)
                horizontalLineTo(16.207f)
                verticalLineTo(17.142f)
                horizontalLineTo(13.679f)
                verticalLineTo(11.398f)
                horizontalLineTo(11.235f)
                verticalLineTo(17.142f)
                horizontalLineTo(8.707f)
                verticalLineTo(11.398f)
                horizontalLineTo(7.25f)
                verticalLineTo(9.256f)
                horizontalLineTo(8.707f)
                verticalLineTo(8.612f)
                curveTo(8.707f, 6.941f, 9.95f, 5.784f, 11.793f, 5.784f)
                horizontalLineTo(13.679f)
                verticalLineTo(7.927f)
                close()
            }
        }
        .build()
        return _fiverrLine!!
    }

private var _fiverrLine: ImageVector? = null
