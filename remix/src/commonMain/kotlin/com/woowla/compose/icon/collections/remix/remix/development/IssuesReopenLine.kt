package com.woowla.compose.icon.collections.remix.remix.development

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.DevelopmentGroup

public val DevelopmentGroup.IssuesReopenLine: ImageVector
    get() {
        if (_issuesReopenLine != null) {
            return _issuesReopenLine!!
        }
        _issuesReopenLine = Builder(name = "IssuesReopenLine", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                curveTo(8.728f, 22.0f, 5.824f, 20.429f, 4.0f, 18.001f)
                verticalLineTo(20.5f)
                horizontalLineTo(2.0f)
                verticalLineTo(14.5f)
                horizontalLineTo(8.0f)
                verticalLineTo(16.5f)
                horizontalLineTo(5.385f)
                curveTo(6.825f, 18.614f, 9.252f, 20.0f, 12.0f, 20.0f)
                curveTo(16.418f, 20.0f, 20.0f, 16.418f, 20.0f, 12.0f)
                horizontalLineTo(22.0f)
                close()
                moveTo(12.0f, 10.0f)
                curveTo(13.105f, 10.0f, 14.0f, 10.895f, 14.0f, 12.0f)
                curveTo(14.0f, 13.105f, 13.105f, 14.0f, 12.0f, 14.0f)
                curveTo(10.895f, 14.0f, 10.0f, 13.105f, 10.0f, 12.0f)
                curveTo(10.0f, 10.895f, 10.895f, 10.0f, 12.0f, 10.0f)
                close()
                moveTo(12.0f, 2.0f)
                curveTo(15.272f, 2.0f, 18.176f, 3.571f, 20.0f, 5.999f)
                verticalLineTo(3.5f)
                horizontalLineTo(22.0f)
                verticalLineTo(9.5f)
                horizontalLineTo(16.0f)
                verticalLineTo(7.5f)
                horizontalLineTo(18.615f)
                curveTo(17.175f, 5.386f, 14.748f, 4.0f, 12.0f, 4.0f)
                curveTo(7.582f, 4.0f, 4.0f, 7.582f, 4.0f, 12.0f)
                horizontalLineTo(2.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _issuesReopenLine!!
    }

private var _issuesReopenLine: ImageVector? = null
