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

public val LogosGroup.FiverrFill: ImageVector
    get() {
        if (_fiverrFill != null) {
            return _fiverrFill!!
        }
        _fiverrFill = Builder(name = "FiverrFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(11.793f, 5.784f)
                curveTo(9.95f, 5.784f, 8.707f, 6.941f, 8.707f, 8.612f)
                verticalLineTo(9.256f)
                horizontalLineTo(7.25f)
                verticalLineTo(11.398f)
                horizontalLineTo(8.707f)
                verticalLineTo(17.142f)
                horizontalLineTo(11.235f)
                verticalLineTo(11.398f)
                horizontalLineTo(13.679f)
                verticalLineTo(17.142f)
                horizontalLineTo(16.207f)
                verticalLineTo(9.256f)
                horizontalLineTo(11.235f)
                verticalLineTo(8.784f)
                curveTo(11.235f, 8.27f, 11.622f, 7.927f, 12.179f, 7.927f)
                horizontalLineTo(13.679f)
                verticalLineTo(5.784f)
                horizontalLineTo(11.793f)
                close()
            }
        }
        .build()
        return _fiverrFill!!
    }

private var _fiverrFill: ImageVector? = null
