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

public val LogosGroup.MicrosoftLine: ImageVector
    get() {
        if (_microsoftLine != null) {
            return _microsoftLine!!
        }
        _microsoftLine = Builder(name = "MicrosoftLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.001f, 5.0f)
                horizontalLineTo(5.001f)
                verticalLineTo(11.0f)
                horizontalLineTo(11.001f)
                verticalLineTo(5.0f)
                close()
                moveTo(13.001f, 5.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(19.001f)
                verticalLineTo(5.0f)
                horizontalLineTo(13.001f)
                close()
                moveTo(19.001f, 13.0f)
                horizontalLineTo(13.001f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.001f)
                verticalLineTo(13.0f)
                close()
                moveTo(11.001f, 19.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(5.001f)
                verticalLineTo(19.0f)
                horizontalLineTo(11.001f)
                close()
                moveTo(3.001f, 3.0f)
                horizontalLineTo(21.001f)
                verticalLineTo(21.0f)
                horizontalLineTo(3.001f)
                verticalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _microsoftLine!!
    }

private var _microsoftLine: ImageVector? = null
