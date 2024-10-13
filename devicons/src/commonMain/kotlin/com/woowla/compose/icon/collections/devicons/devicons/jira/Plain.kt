package com.woowla.compose.icon.collections.devicons.devicons.jira

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.JiraGroup

public val JiraGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(61.81f, 16.0f)
                curveToRelative(0.0f, 11.52f, 9.33f, 20.85f, 20.85f, 20.85f)
                horizontalLineToRelative(8.5f)
                verticalLineToRelative(8.23f)
                curveToRelative(0.0f, 11.52f, 9.33f, 20.85f, 20.85f, 20.85f)
                verticalLineToRelative(-45.94f)
                arcToRelative(3.98f, 3.98f, 0.0f, false, false, -3.98f, -3.98f)
                horizontalLineToRelative(-46.22f)
                close()
                moveTo(38.9f, 39.04f)
                curveToRelative(0.0f, 11.52f, 9.32f, 20.85f, 20.84f, 20.85f)
                horizontalLineToRelative(8.5f)
                verticalLineToRelative(8.23f)
                curveToRelative(0.0f, 11.52f, 9.33f, 20.85f, 20.85f, 20.85f)
                verticalLineToRelative(-45.94f)
                arcToRelative(3.98f, 3.98f, 0.0f, false, false, -3.98f, -3.98f)
                horizontalLineToRelative(-46.22f)
                close()
                moveTo(16.0f, 62.08f)
                curveToRelative(0.0f, 11.52f, 9.32f, 20.85f, 20.84f, 20.85f)
                horizontalLineToRelative(8.5f)
                verticalLineToRelative(8.23f)
                curveToRelative(0.0f, 11.52f, 9.33f, 20.85f, 20.85f, 20.85f)
                verticalLineToRelative(-45.94f)
                arcToRelative(3.98f, 3.98f, 0.0f, false, false, -3.98f, -3.98f)
                horizontalLineToRelative(-46.22f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
