package com.woowla.compose.icon.collections.tabler.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.Video: ImageVector
    get() {
        if (_video != null) {
            return _video!!
        }
        _video = Builder(name = "Video", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.117f, 7.625f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.564f, 0.1f)
                lineToRelative(-4.553f, 2.275f)
                verticalLineToRelative(4.0f)
                lineToRelative(4.553f, 2.275f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.447f, -0.892f)
                verticalLineToRelative(-6.766f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.883f, -0.992f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                curveToRelative(-1.645f, 0.0f, -3.0f, 1.355f, -3.0f, 3.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 1.645f, 1.355f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(1.645f, 0.0f, 3.0f, -1.355f, 3.0f, -3.0f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -1.645f, -1.355f, -3.0f, -3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _video!!
    }

private var _video: ImageVector? = null
