package com.woowla.compose.icon.collections.remix.remix.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.SystemGroup

public val SystemGroup.QuestionLine: ImageVector
    get() {
        if (_questionLine != null) {
            return _questionLine!!
        }
        _questionLine = Builder(name = "QuestionLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(12.0f, 20.0f)
                curveTo(16.418f, 20.0f, 20.0f, 16.418f, 20.0f, 12.0f)
                curveTo(20.0f, 7.582f, 16.418f, 4.0f, 12.0f, 4.0f)
                curveTo(7.582f, 4.0f, 4.0f, 7.582f, 4.0f, 12.0f)
                curveTo(4.0f, 16.418f, 7.582f, 20.0f, 12.0f, 20.0f)
                close()
                moveTo(11.0f, 15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.0f)
                close()
                moveTo(13.0f, 13.355f)
                verticalLineTo(14.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(12.5f)
                curveTo(11.0f, 11.948f, 11.448f, 11.5f, 12.0f, 11.5f)
                curveTo(12.828f, 11.5f, 13.5f, 10.828f, 13.5f, 10.0f)
                curveTo(13.5f, 9.172f, 12.828f, 8.5f, 12.0f, 8.5f)
                curveTo(11.272f, 8.5f, 10.666f, 9.018f, 10.529f, 9.706f)
                lineTo(8.567f, 9.313f)
                curveTo(8.886f, 7.709f, 10.302f, 6.5f, 12.0f, 6.5f)
                curveTo(13.933f, 6.5f, 15.5f, 8.067f, 15.5f, 10.0f)
                curveTo(15.5f, 11.585f, 14.446f, 12.925f, 13.0f, 13.355f)
                close()
            }
        }
        .build()
        return _questionLine!!
    }

private var _questionLine: ImageVector? = null
