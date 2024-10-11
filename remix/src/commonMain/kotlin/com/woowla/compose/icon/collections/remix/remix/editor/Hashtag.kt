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

public val EditorGroup.Hashtag: ImageVector
    get() {
        if (_hashtag != null) {
            return _hashtag!!
        }
        _hashtag = Builder(name = "Hashtag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.784f, 14.0f)
                lineTo(8.205f, 10.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(8.415f)
                lineTo(8.94f, 3.0f)
                horizontalLineTo(10.951f)
                lineTo(10.426f, 8.0f)
                horizontalLineTo(14.415f)
                lineTo(14.94f, 3.0f)
                horizontalLineTo(16.951f)
                lineTo(16.426f, 8.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(16.216f)
                lineTo(15.795f, 14.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(15.585f)
                lineTo(15.06f, 21.0f)
                horizontalLineTo(13.049f)
                lineTo(13.574f, 16.0f)
                horizontalLineTo(9.585f)
                lineTo(9.06f, 21.0f)
                horizontalLineTo(7.049f)
                lineTo(7.574f, 16.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(7.784f)
                close()
                moveTo(9.795f, 14.0f)
                horizontalLineTo(13.784f)
                lineTo(14.205f, 10.0f)
                horizontalLineTo(10.216f)
                lineTo(9.795f, 14.0f)
                close()
            }
        }
        .build()
        return _hashtag!!
    }

private var _hashtag: ImageVector? = null
